package maven_vsc._03_Herencia;

public class ClaseAbstracta {
    public static void main(String[] args) {
        Factura factura = new Factura(7);
        factura.abrir();
    }
}

abstract class Documento {
    public abstract void abrir();
}

class Factura extends Documento {
    private int numero;

    Factura(int numero) {
        this.numero = numero;
    }

    @Override
    public void abrir() {
        System.out.println("Muestra factura numero: " + numero);
    }
}