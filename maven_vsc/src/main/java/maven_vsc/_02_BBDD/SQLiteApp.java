package maven_vsc._02_BBDD;

import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteApp {

    private final String nombreBaseDatos;
    private Connection conexion;


    public SQLiteApp(String nombreBaseDatos) throws SQLException {
        this.nombreBaseDatos = nombreBaseDatos;
        Path rutaBaseDatos = Path.of("C:/courses/java_vsc/maven_vsc/src/main", this.nombreBaseDatos + ".db");
        String url = "jdbc:sqlite:" + rutaBaseDatos;
        this.conexion = DriverManager.getConnection(url);
    }

    public void crearTabla() throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS items (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT UNIQUE,
                precio REAL
            );
        """;

        try (Statement consulta = this.conexion.createStatement()) {
            consulta.execute(sql);
        
        }
    }

    public void cerrar() throws SQLException {
        if (this.conexion != null && !this.conexion.isClosed()) {
            this.conexion.close();
        }
    }
    public void insertarItem(String nombre, double precio) throws SQLException
    {
        String sql = "insert or ignore into items (nombre, precio) values (? ,? );";
        
        try (PreparedStatement consulta = this.conexion.prepareStatement(sql))
        {        
        consulta.setString(1, nombre);
        consulta.setDouble(2, precio);

        consulta.executeUpdate();
                
        }
    }

    public void mostrarDatos() throws SQLException 
    {
        String sql = "select * from items;";
        try(PreparedStatement consulta = this.conexion.prepareStatement(sql))  {

        ResultSet datos = consulta.executeQuery();
        while (datos.next()) {
            System.out.print(datos.getInt("id") + " ");
            System.out.print(datos.getString("nombre") + " ");
            System.out.print(datos.getDouble("precio") );
            System.out.println();

        }
        }
     }

    public static void main(String[] args) {
     SQLiteApp
     app = null;
        try {
            app = new SQLiteApp
        ("mi_basededaticos");
            app.conexion.setAutoCommit(false);
            app.crearTabla();
            app.insertarItem("David", 400.0);
            app.insertarItem("Jean", 500.0);
            app.insertarItem("Adair", 300.0);
            app.mostrarDatos();
            app.conexion.commit();
            System.out.println("Base de datos creada o abierta correctamente.");
            System.out.println("Tabla 'items' creada o ya existente en C:/java_vsc_maven/mi_basededaticos.db");
        } catch (SQLException esteEsElError) {
            System.out.println("Error al crear la base de datos o la tabla.");
            System.out.println(esteEsElError.getMessage());
            if (app != null) {
                try {
                    if (app.conexion != null && !app.conexion.isClosed()) {
                        app.conexion.rollback();
                    }
                } catch (SQLException rollbackError) {
                    System.out.println("Error al hacer rollback: " + rollbackError.getMessage());
                }
            }
        } finally {
            if (app != null) {
                try {
                    app.cerrar();
                } catch (SQLException cierreError) {
                    System.out.println("Error al cerrar la conexion: " + cierreError.getMessage());
                }
            }
        }
    }
}