package maven_vsc._02_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sql01 {
    public static void main(String[] args) {

        String url="jdbc:sqlite:prueba.db";

        // System.out.println("Hi\nWorld");
        try{
            Connection conexion = DriverManager.getConnection(url);
            String crearTabla = "CREATE TABLE producto (" + 
                                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                                "nombre TEXT UNIQUE,"+
                                "precio REAL )";
            System.out.println(crearTabla);

            Statement consulta = conexion.createStatement();
            consulta.execute(crearTabla);

        }catch(Exception excepcion){
            System.out.println(excepcion.getMessage());
        }

    }
}
