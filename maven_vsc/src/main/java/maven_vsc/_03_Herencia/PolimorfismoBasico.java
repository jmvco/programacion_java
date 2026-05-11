package maven_vsc._03_Herencia;

public class PolimorfismoBasico {
    public static void main(String[] args) {
        
        Instrumento[] instrumentos = new Instrumento[2];
        instrumentos[0] = new Piano();
        instrumentos[1] = new Violin();

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}

class Instrumento {
    public void tocar() {
        System.out.println("Suena un instrumento");
    }
}

class Piano extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Suena un piano");
    }
}

class Violin extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Suena un violin");
    }
}