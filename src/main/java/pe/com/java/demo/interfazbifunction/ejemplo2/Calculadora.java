package pe.com.java.demo.interfazbifunction.ejemplo2;

import java.util.function.BiFunction;

public class Calculadora {

    public String calc(BiFunction<Integer, Integer, String> bfunction,
                       Integer param1, Integer param2){
        System.out.println("Ingreso de valores ");
        System.out.println("valor 1: "+    param1);
        System.out.println("valor 2: "+    param2);
        return bfunction.apply(param1,param2);

    }
}
