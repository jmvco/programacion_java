package maven_vsc._05_Interfaz;

public class MetodoDefault {
  public static void main(String[] args) {
    Visitante visitante = new Visitante();
    visitante.saludar();
  }
}

interface Bienvenida {
  default void saludar() {
    System.out.println("Bienvenido al portal");
  }
}

class Visitante implements Bienvenida {

}