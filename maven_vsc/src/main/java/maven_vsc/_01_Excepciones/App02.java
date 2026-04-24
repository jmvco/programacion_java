package maven_vsc._01_Excepciones;

// Control de errores usando el estructura 'if'
// es decir se comprueba el error antes de ejecutar el operación

public class App02 {

    // Variables de la clase
    private double dividendo;
    private double divisor;
    private double resultado;
    private String errorValidacion;

    // Constructor: inicializa valores
    public App02(int numeroUno, int numeroDos) {
        this.dividendo = numeroUno;
        this.divisor = numeroDos;
        this.resultado = 0.0;
        this.errorValidacion = null;
    }

    // Metodo que valida antes de dividir
    public void calcularDivision() {
        if (this.divisor != 0) {
            // Si el divisor es válido, realiza la división
            this.resultado = this.dividendo / this.divisor;
        } else if (this.divisor == 0) {
            // Si el divisor es 0, guarda el error
            this.errorValidacion = "Error";
        }
    }

    public static void main(String[] args) {

        // Crear objeto y ejecutar cálculo
        App02 objeto = new App02(6, 2);
        objeto.calcularDivision();

        // Mostrar resultado o error
        if (objeto.errorValidacion == null) {
            System.out.println("Resultado App02: " + objeto.resultado);
        } else {
            System.out.println(objeto.errorValidacion);
        }
    }
}