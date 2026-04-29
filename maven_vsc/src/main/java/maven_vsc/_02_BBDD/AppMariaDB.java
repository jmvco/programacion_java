package maven_vsc._02_BBDD;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppMariaDB 
{
   private String ip;
   private int puerto;
   private String usuario;
   private String contraseña;
   private String nombre;
   private Connection conexion;
   private Statement declaracion;

   public AppMariaDB(String ip, int puerto,String usuario,String contraseña,String nombre ) throws SQLException
  {
    this.ip = ip;
    this.puerto = puerto;
    this.usuario = usuario;
    this.contraseña = contraseña;
    this.nombre = nombre;
    String url = "jdbc:mariadb://" + ip + ":" +puerto + "/" + nombre ;
    this.conexion = DriverManager.getConnection(url,this.usuario,this.contraseña);
    this.declaracion = this.conexion.createStatement();
  } 
  public static void main(String[] args) throws SQLException
  {
    String ip = "127.0.0.1";
    int puerto = 3307;
    String usuario = "root";
    String contraseña = "jeanm";
    String nombre = "pruebaBD";
    
    AppMariaDB app = new AppMariaDB(ip, puerto, usuario, contraseña, nombre);
    app.crearBaseDatos();
  }
  // crear metodo
  public void crearBaseDatos()
  {

  }
}