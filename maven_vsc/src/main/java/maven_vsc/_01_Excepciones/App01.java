package maven_vsc._01_Excepciones;

public class App01 {

    // Atributos
    private double dividendo;
    private double divisor;
    private double resultado;

    // Constructor with parameters
    public App01(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
        this.resultado = 0.0;
    }

    // GETTER (resultado)
    public double getResultado() {
        return resultado;
    }

    // METHOD (calcular division)
    public void calcularDivision() {
        this.resultado = this.dividendo / this.divisor;
    }

    // Main
    public static void main(String[] args) {
        // Exception: evento que interrumpe el flujo normal de un programa durante su
        // ejecución, y se
        // utiliza para manejar errores de manera controlada.

        // El programa no controla el error
        // Si ocurre una división entre 0 el programa termina con una expectation
        
        App01 objeto = new App01(6, 0);

        objeto.calcularDivision();
        System.out.println(objeto.getResultado());
    }
}