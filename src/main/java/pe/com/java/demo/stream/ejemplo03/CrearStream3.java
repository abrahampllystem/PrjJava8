package pe.com.java.demo.stream.ejemplo03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CrearStream3 {

    public static void main(String[] args) {
        arregloEntero();
    }


    public static void arregloEntero() {
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});

        numStream.forEach(System.out::println);

    }
}
