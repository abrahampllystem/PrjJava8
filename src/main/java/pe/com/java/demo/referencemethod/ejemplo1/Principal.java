package pe.com.java.demo.referencemethod.ejemplo1;

import pe.com.java.demo.referencemethod.ejemplo1.bean.Persona;
import pe.com.java.demo.referencemethod.util.ProveedorComparaciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Persona> personas= carga();
        System.out.println("Persona sin ordenar");
        personas.forEach(System.out::println);
        System.out.println("========") ;


//        Collections.sort(personas, (person1,person2) -> person1.getEdad().compareTo(person2.getEdad()));
        Collections.sort(personas, Persona::comparadorEdad2);
        System.out.println("Persona  ordenadas por edad");
        personas.forEach(person -> System.out.println(person));
        System.out.println("==============");


        ProveedorComparaciones comparador= new ProveedorComparaciones();

//        Collections.sort(personas, comparador::compararPorNombre);
        System.out.println("Personas ordenadas por nombre");

        personas.forEach(System.out::println);

    }

    public static List<Persona> carga(){


        return Arrays.asList(
                Persona.builder().nombre("Kike").edad(18).email("kike@hotmail.com").build(),
                Persona.builder().nombre("Mario").edad(17).email("mario@hotmail.com").build(),
                Persona.builder().nombre("Arturo").edad(17).email("arturito@hotmail.com").build(),
                Persona.builder().nombre("Maria").edad(15).email("maria@hotmail.com").build(),
                Persona.builder().nombre("Beatriz").edad(14).email("beatriz@hotmail.com").build(),
                Persona.builder().nombre("Olivia").edad(12).email("oli@hotmail.com").build(),
                Persona.builder().nombre("Ángel").edad(25).email("angelito@hotmail.com").build(),
                Persona.builder().nombre("Omar").edad(32).email("omarcito@hotmail.com").build(),
                Persona.builder().nombre("Pamela").edad(28).email("pamelita@hotmail.com").build(),
                Persona.builder().nombre("Sadee").edad(25).email("sadecita@hotmail.com").build(),
                Persona.builder().nombre("Jared").edad(12).email("jaredcito@hotmail.com").build(),
                Persona.builder().nombre("Sebastian").edad(14).email("sebastiancito@hotmail.com").build(),
                Persona.builder().nombre("Javier").edad(18).email("javiercito@hotmail.com").build(),
                Persona.builder().nombre("Roberto").edad(20).email("robertito@hotmail.com").build(),
                Persona.builder().nombre("Oyuki").edad(22).email("oyukita@hotmail.com").build(),
                Persona.builder().nombre("Linda").edad(25).email("Lindita@hotmail.com").build(),
                Persona.builder().nombre("Gustavo").edad(14).email("tavo@hotmail.com").build(),
                Persona.builder().nombre("Lourdes").edad(15).email("lulita@hotmail.com").build(),
                Persona.builder().nombre("Raquel").edad(16).email("raquelita@hotmail.com").build());
    }
}

