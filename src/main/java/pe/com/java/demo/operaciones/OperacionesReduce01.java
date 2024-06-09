package pe.com.java.demo.operaciones;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class OperacionesReduce01 {

    public static void main(String[] args) {
        int [] numero= {
                4,6,10,12,15,55,7,8,9,10,2,5,
                8,9,10,45,6,9,33,66,85,97,81,24,99
        };

        int suma= IntStream.of(numero)
                .reduce(0, (left,right)-> Integer.sum(left,right));
        System.out.println("el resultado de la suma es : "+ suma);

        
    }
}
