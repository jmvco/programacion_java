package maven_vsc._01_Excepciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SayHello {
    public static void main(String[] args) {

        // Imprimir por consola
        System.out.println("Say Hello");

        System.out.println("------------List-----------");
        // Las Listas son ordenadas y dinamicos
        // creacion del ArrayList "names"
        var names = new ArrayList<>();
        names.add("Jean");
        names.add("Marco");

        // Imprimir los elementos del "List"
        System.out.println(names);

        // Imprimir el tamaño del "List"
        System.out.println(names.size());

        System.out.println("-------------Sets------------");
        // a diferencia de las Listas estas son desordenadas
        // Creacion del HashSet
        var players = new HashSet<>();

        // Agregando elementos al "Set"
        players.add("Pedri");
        players.add("Lamine");

        // Imprimir la lista de elementos del Set
        System.out.println(players);

        // Imprimir el tamaño del Set
        System.out.println(players.size());

        System.out.println("-------------Maps------------");
        // Un Map en Java es una colección que asocia claves únicas a valores.
        // Creacion del HashMap (clave ,valor)
        var equiposFutbol = new java.util.HashMap<String, String>();

        // Agregando elementos al Map
        equiposFutbol.put("FCB", "FC Barcelona");
        equiposFutbol.put("RMA", "Real Madrid");
        equiposFutbol.put("ATM", "Atletico de Madrid");
        equiposFutbol.put("SEV", "Sevilla FC");

        // Imprimir los elementos del Map
        System.out.println(equiposFutbol);

        // Imprimir el tamaño de Map
        System.out.println(equiposFutbol.size());
        
    }

}
