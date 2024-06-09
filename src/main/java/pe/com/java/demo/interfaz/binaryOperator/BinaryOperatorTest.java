package pe.com.java.demo.interfaz.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<Integer>  bOperator = (num1, num2) -> num1*num2;

        // Aplicando el metodo applu
        int resultado= bOperator.apply(10,20);
        System.out.println("El resultado es : "+ resultado);

        BinaryOperator<Integer> bOperatorMin= BinaryOperator.minBy( (Integer t1, Integer t2) ->
                t1.compareTo(t2)
                );

        resultado = bOperatorMin.apply(10,20);
        System.out.println("\nEjemplo metodo min con bioperator");

        System.out.println("el numero menor de 10 y 20 es : "+ resultado);

        BinaryOperator<Integer> bOperatorMax= BinaryOperator.maxBy( (Integer t1, Integer t2) ->
                t1.compareTo(t2)
        );

        resultado = bOperatorMax.apply(10,20);
        System.out.println("\nEjemplo metodo max con bioperator");
        System.out.println("el numero mayor de 10 y 20 es : "+ resultado);


    }
}
