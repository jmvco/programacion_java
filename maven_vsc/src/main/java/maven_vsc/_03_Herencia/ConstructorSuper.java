package maven_vsc._03_Herencia;

import java.io.IOException;

public class ConstructorSuper {
    public static void main(String[] args) throws InterruptedException, IOException {

        Alumno alumno = new Alumno("Arthur", "Java");
        alumno.borrarTerminal();
        System.out.println(alumno.getNombre());
        System.out.println(alumno.getCurso());
    }
}

class Persona {
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}

class Alumno extends Persona {
    private String curso;

    public Alumno(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void borrarTerminal() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}