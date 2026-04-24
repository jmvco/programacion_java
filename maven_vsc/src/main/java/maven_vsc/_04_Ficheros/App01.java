package maven_vsc._04_Ficheros;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class App01
{
    public static void main( String[] objetoArgs ) throws InterruptedException, IOException
    {
        //System.out.print("\033[H\033[2J");
        App01 objetoApp = new App01();
        objetoApp.borrarTerminal();
        try
        {
            objetoApp.mostrarArgumentoCero();
            objetoApp.mostrarArgumentos( objetoArgs );
            objetoApp.escribirArchivo( objetoArgs );
            objetoApp.leerArchivo();
        }
        catch( IOException excepcion )
        {
            System.out.println( "Error al leer o escribir el archivo: " + excepcion.getMessage() );
        }
    }
    public void mostrarArgumentoCero()
    {
        System.out.println( "Contenido de los argumentos recibidos:" );
        System.out.println( "Argumento 0: App" );
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
        objetoSB.append( "Argumentos: App " );
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
        System.out.println();
        System.out.println( "Contenido final del archivo modificado:" );
        System.out.println(fichero);
    }
    public void borrarTerminal() throws InterruptedException, IOException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
    }
}