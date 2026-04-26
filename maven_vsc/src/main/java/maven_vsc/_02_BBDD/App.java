package maven_vsc._02_BBDD;

import java.sql.SQLException;
public class App 
{
  public static void main(String[] args) 
  {
    String ip = "127.0.0.1";
    int puerto = 3307;
    String contraseña = "EstoyHartoDeSalir1";
    String nombre = "Cr7";
    String url = "jdbc:mariadb://" + ip + ":" +puerto + "/" + nombre ;
    System.out.println(url);
    try
    {
      
    }
    catch( SQLException excepcions )
    {

    }
  } 
}