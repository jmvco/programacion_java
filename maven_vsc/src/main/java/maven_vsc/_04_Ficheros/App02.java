package maven_vsc._04_Ficheros;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class App02
{
  public static void main(String[] args)
  {
    App02 app = new App02();
    app.mostrarUso();
    app.leerArchivo(args[0]);
    app.informacionArchivo(args[0]);
  }
  public void mostrarUso()
  {
    // System.out.println("java App2.java datos.txt");
  }          
  public void leerArchivo(String archivo)
  {
    try
    {
      java.nio.file.Path ruta = Paths.get(archivo);
      String contenido = Files.readString(ruta,StandardCharsets.UTF_8);
    //   System.out.println("Contenido del archivo:");
      System.out.println(contenido);
    }
    catch( IOException exception )
    {
      System.out.println( "Error: el archivo no existe" );
    }
  }
  public void informacionArchivo(String archivo)
  {
   try {
    
   } catch (Exception excepcion) {
    
   }
  }
}