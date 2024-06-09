package pe.com.java.demo.interfaz.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenacion {

    public static void main(String[] args) {
        List<String> list = carga();
        System.out.println("Lista de nombre antes de ordernanse: "+ list);

        Collections.sort(list);
        System.out.println("Lista de nombre despues de ordernanse: "+ list);



    }

    public static List<String>  carga() {
        List<String> nombre = Arrays.asList("Carlos","Ana","Abias","Gio");

        return nombre;
    }
}
