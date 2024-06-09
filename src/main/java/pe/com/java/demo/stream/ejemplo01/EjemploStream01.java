package pe.com.java.demo.stream.ejemplo01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream01 {


    public static void main(String[] args) {

        List<Integer>  listaInicial = carga();
        int suma = listaInicial.stream()
                .filter(n -> n%2 == 1)
                .map(m -> m*m)
                .reduce(0, Integer::sum);

        System.out.println("la suma  de los numeros impares es : "+ suma);

    }

    public static List<Integer> carga() {
    return Arrays.asList(1,2,3,4,5);
    }
}
