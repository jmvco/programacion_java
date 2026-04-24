package maven_vsc._02_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql02 {

    private String nombreBaseDatos;
    private Connection conexion;

    public Sql02(String nombreBaseDatos) throws SQLException {
        this.nombreBaseDatos = nombreBaseDatos;
        String url = "jdbc:sqlite:" + this.nombreBaseDatos + ".db";
        this.conexion = DriverManager.getConnection(url);
    }

    // Metodos
    public void crearTabla() throws SQLException {
        String sql = """
                    CREATE TABLE IF NOT EXISTS items (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        nombre TEXT UNIQUE,
                        precio REAL
                    );
                """;

        Statement consulta = this.conexion.createStatement();
        consulta.execute(sql);
    }

    public static void main(String[] args) {
        try {
            Sql02 app = null;
            app = new Sql02("mi_basededaticos");
            app.conexion.setAutoCommit(false);
            app.crearTabla();
            app.conexion.commit();
        } catch (SQLException esteEsElError) {
            System.out.println("Houston, we have a problem");
            System.out.println(esteEsElError);
        } finally {
            System.out.println("Final del programa");
        }
    }
}