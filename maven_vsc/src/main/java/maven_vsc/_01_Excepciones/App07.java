    package maven_vsc._01_Excepciones;
    /* 
        Vamos a estudiar como se propagan excepciones en codigo java
        se utiliza la palabra reservada "throws" 
        en este caso el metodo no maneja la excepcion, sino que la envia al metodo que le llama
        El metodo que no maneja la excepcion es "calcularDivision"
        El metodo que le llama es "main"
    */

    public class App07 {

        private int dividendo;
        private int divisor;
        private float resultado;
        private String error;
        private boolean finaliza;

        public App07(int numeroUno, int numeroDos) {
            this.dividendo = numeroUno;
            this.divisor = numeroDos;
            this.resultado = 0.0f;
            this.error = "Debe introducir un numero que no sea cero";
            this.finaliza = false;
        }

        public void calcularDivision() {

            // if (this.divisor != 0) {
                this.resultado = (float) this.dividendo / this.divisor;
            //     this.finaliza = true;
            // } else if (this.divisor == 0) {
            //     throw new ArithmeticException(this.error);
            // }

        }

        public static void main(String[] args) {

            App07 objeto = new App07(6, 0);

            try {
                objeto.calcularDivision();
                System.out.println("El resultado de la division es: " + objeto.resultado);

            } catch (ArithmeticException mi_errorsito) {
                System.out.println(mi_errorsito);
            }
            finally{
                System.out.println("¿finaliza el programa? " + objeto.finaliza);
            }
        }
    }
