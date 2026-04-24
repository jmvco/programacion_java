package maven_vsc._01_Excepciones;

// Manejo de exception en java usando la estructura try catch
// el error primero ocurre y luego se captura mediante una exception

public class App03 {

    // Variables de la clase
    private int dividendo;
    private int divisor;
    private double resultado;
    private String error;

    // Constructor: inicializa los valores
    public App03(int numeroUno, int numeroDos) {
        this.dividendo = numeroUno;
        this.divisor = numeroDos;
        this.resultado = 0.0;
        this.error = null;
    }

    // Metodo que realiza la división con control de errores
    public void calcularDivision() {
        try {
            // Intenta hacer la división
            this.resultado = (double) this.dividendo / this.divisor;

        } catch (ArithmeticException excepcion) {
            // Si ocurre un error (ej: división por 0), guarda el mensaje
            this.error = "Error";
        }
    }

    public static void main(String[] args) {

        // Se crea el objeto con valores
        App03 objeto = new App03(6, 0);
        // Se ejecuta la división
        objeto.calcularDivision();

        // Verifica si hubo error o no
        if (objeto.error == null) {
            System.out.println("Resultado App03: " + objeto.resultado);
        } else {
            System.out.println(objeto.error);
        }
    }
}