package maven_vsc._02_BBDD;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestionRelacionalApp {
  private String servidor;
  private int puerto;
  private String usuario;
  private String contrasena;
  private String nombreBaseDatos;
  private String nombreTabla;
  private Connection conexion;
  private Statement sentencia;
  private boolean baseDatosSeleccionada;
  private boolean datosConexionConfigurados;

  public GestionRelacionalApp() {
    this.baseDatosSeleccionada = false;
    this.datosConexionConfigurados = false;
  }

  public static void main(String[] args) throws SQLException {
    GestionRelacionalApp aplicacion = null;
    boolean cambiosConfirmados = false;
    aplicacion = new GestionRelacionalApp();
    System.out.println("Datos conexion configurados: " + aplicacion.datosConexionConfigurados);
    aplicacion.configurarDatosConexion();
    System.out.println("Datos conexion configurados: " + aplicacion.datosConexionConfigurados);
    aplicacion.conectar();
    System.out.println("Conexion correcta");

  }

  public void configurarDatosConexion() {
    this.servidor = "127.0.0.1";
    this.puerto = 3307;
    this.usuario = "root";
    this.contrasena = "jeanm";
    this.nombreBaseDatos = "tienda";
    this.nombreTabla = "producto";
    datosConexionConfigurados = true;
  }

  private void comprobarDatosConexionConfigurados() throws SQLException {
    if (datosConexionConfigurados != true) {
      throw new SQLException("los datos de conexion no estan configurados");
    }
  }

  private String construirUrlServidor() {
    return "jdbc:mariadb://" + this.servidor + ":" + this.puerto + "/";
  }

  private void comprobarConexion() throws SQLException {
    if (this.conexion == null || this.conexion.isClosed()) {
      throw new SQLException("No hay conexion activa");
    }
  }

  public void conectar() throws SQLException {
    comprobarDatosConexionConfigurados();
    if (this.conexion != null && !this.conexion.isClosed()) {
      throw new SQLException("Si hay conexion existente");
    }

    String url = construirUrlServidor();
    this.conexion = DriverManager.getConnection(url, this.usuario, this.contrasena);
    this.sentencia = this.conexion.createStatement();
    this.baseDatosSeleccionada = false;
  }
}