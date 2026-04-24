package maven_vsc._01_Excepciones;

/* 
    Vamos a lanzar una excepcion manualmente en una linea de codigo completa
    se utiliza en java la palbra reservada "throw" seguida de la creacion del objeto
    el progrmador decide en que momentyo del flujo del codigo se lanz la excepcion
*/

public class App06 {

    private int dividendo;
    private int divisor;
    private float resultado;
    private String error;
    private boolean finaliza;

    public App06(int numeroUno, int numeroDos) {
        this.dividendo = numeroUno;
        this.divisor = numeroDos;
        this.resultado = 0.0f;
        this.error = "Debe introducir un numero que no sea cero";
        this.finaliza = false;
    }

    public void calcularDivision() {

        if (this.divisor != 0) {
            this.resultado = (float) this.dividendo / this.divisor;
            this.finaliza = true;
        } else if (this.divisor == 0) {
            throw new ArithmeticException(this.error);
        }

    }

    public static void main(String[] args) {

        App06 objeto = new App06(6, 10);

        try {
            objeto.calcularDivision();
            System.out.println("El resultado de la division es: " + objeto.resultado);

            for(int numero: new int[] {1,2,3,4}){
                System.out.print(numero + " ");
            }
            System.out.println();

        } catch (ArithmeticException mi_errorsito) {
            System.out.println(mi_errorsito);
        }
        finally{
            System.out.println("¿finaliza el programa? " + objeto.finaliza);
        }
    }
}
