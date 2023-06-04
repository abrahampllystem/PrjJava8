package pe.com.java.demo.interfaceFunctional;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {

        Function<Integer, String> convertidor=  param1 -> Integer.toString(param1);

        System.out.println("convertidor :" + convertidor.apply(3).length());
        System.out.println("convertidor :" + convertidor.apply(30).length());

    }
}
