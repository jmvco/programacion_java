package maven_vsc._01_Excepciones;
/* Uso de la palabra reservada finally
el bloque finally se ejecuta siempre, exista error, o no exista error */
public class App04
{
    private int dividendo;
    private int divisor;
    private float resultado;
    private String error;
    private boolean operacionFinal;
    
    public App04(int numeroUno, int numeroDos)
    {
        this.dividendo = numeroUno;
        this.divisor = numeroDos;
        this.resultado = 0.0f;
        this.error = null;
        this.operacionFinal = false;
    }
    public void calcularDivision()
    {
        try
        {
            this.resultado = this.dividendo / this.divisor;
            this.operacionFinal = true;
        }
        catch (ArithmeticException excepcion)
        {
            this.error = "Error";
        }
        finally
        {
            System.out.println("Operacion finalizada " + this.operacionFinal);
        }
    }
    public static void main(String[] args)
    {
        App04 objeto = new App04(6, 0);
        objeto.calcularDivision();
        if (objeto.error == null)
        {
            System.out.println("resultado App03: " + objeto.resultado);
        }
        else
        {
            System.out.println(objeto.error);
        }
    }
}
