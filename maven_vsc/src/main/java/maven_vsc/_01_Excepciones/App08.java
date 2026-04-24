package maven_vsc._01_Excepciones;

class DivisionEntreCero extends Exception {
    public DivisionEntreCero(String texto) {
        super(texto);
    }
}

public class App08 {
    /*
     * Vamos a estudiar como se propagan excepciones en codigo java
     * se utiliza la palabra reservada "throws"
     * en este caso el metodo no maneja la excepcion, sino que la envia al metodo
     * que le llama
     * El metodo que no maneja la excepcion es "calcularDivision"
     * El metodo que le llama es "main"
     */
    private int dividendo;
    private int divisor;
    private float resultado;
    private String error;
    private boolean finaliza;

    public App08(int numeroUno, int numeroDos) {
        this.dividendo = numeroUno;
        this.divisor = numeroDos;
        this.resultado = 0.0f;
        this.error = "Debe introducir un numero que no sea cero";
        this.finaliza = false;
    }

    public void calcularDivision() throws DivisionEntreCero {
        // if(this.divisor == 0){
        // throw new DivisionEntreCero("error");
        // }
        this.resultado = (float) this.dividendo / this.divisor;

    }

    public static void main(String[] args) {

        App08 objeto = new App08(6, 0);

        try {
            objeto.calcularDivision();
            System.out.println("El resultado de la division es: " + objeto.resultado);

        } catch (DivisionEntreCero mi_errorsito) {
            System.out.println(mi_errorsito);
        } finally {
            System.out.println("¿finaliza el programa? " + objeto.finaliza);
        }
    }
}