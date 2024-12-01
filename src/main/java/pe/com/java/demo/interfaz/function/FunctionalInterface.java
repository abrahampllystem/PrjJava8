package pe.com.java.demo.interfaz.function;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {

        Function<Integer, String> convertidor=  param1 -> Integer.toString(param1);
        Function<Integer, Integer> multiply = n -> n*10;
        Function<Integer,Integer> suma = n->n+10;
        System.out.println("multiplicador :" + multiply.apply(10));
        System.out.println("Suma :" + suma.apply(30));
        Function<Integer, String> andThen = multiply.andThen(convertidor);
        Function<Integer, String> compose = convertidor.compose(multiply);
        Function<Integer,Integer> andThen2= multiply.andThen(suma);
        Function<Integer,Integer> compose1 = multiply.compose(suma);


        System.out.println("uso de AndThen :"+ andThen.apply(40));
        System.out.println("uso de AndThen2 :"+ compose1.apply(40));
        System.out.println("uso de Compose :"+ compose.apply(70));
        System.out.println("uso de Compose1 :"+ compose1.apply(70));

        System.out.println("convertidor :" + convertidor.apply(3).length());
        System.out.println("convertidor :" + convertidor.apply(30).length());
//        System.out.println("prueba :" + convertidor.compose());

    }
}
