package maven_vsc._04_Ficheros;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class App
{
    public static void main( String[] objetoArgs ) throws IOException
    {
        App objetoApp = new App();
        objetoApp.mostrarArgumentoCero();
        objetoApp.mostrarArgumentos( objetoArgs );
        objetoApp.escribirArchivo(objetoArgs);
        objetoApp.leerArchivo();
    }
    public void mostrarArgumentoCero()
    {
        System.out.println( "Contenido de los argumentos recibidos:" );
        System.out.println( "Argumento 0: App1" );
    }
    public void mostrarArgumentos( String[] objetoArgs )
    {
         if( objetoArgs.length > 0 )
         {
            for( int indice = 0;  objetoArgs.length > indice ; indice ++ )      
            {
                System.out.print( objetoArgs[indice] + " " );
            }
         }
         else if( objetoArgs.length <= 0 )
         {
            System.out.println( "No se ha recibido ningún argumento" );
         }
    }
    public void escribirArchivo( String[] objetoArgs ) throws IOException
    {
        StringBuilder objetoSB = new StringBuilder();
        objetoSB.append( "Argumento 0: App" );
        if( objetoArgs.length > 0 )
        {
            for ( String objetoArg: objetoArgs )
            {
                objetoSB.append( objetoArg + " " );
            }
        }
        else if( objetoArgs.length <= 0 )
        {
            System.out.println( "No se ha recibido ningún argumento" );
        }
        Files.write( Paths.get( "argumentos.txt" ) , objetoSB.toString().getBytes(StandardCharsets.UTF_8) );
    }
    public void leerArchivo() throws IOException
    {
        String fichero = Files.readString( Paths.get( "argumentos.txt" ) , StandardCharsets.UTF_8 );
        System.out.println( "Contenido final del archivo modificado:" );
        System.out.println(fichero);
    }
}
