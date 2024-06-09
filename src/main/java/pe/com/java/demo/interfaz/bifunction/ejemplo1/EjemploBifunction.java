package pe.com.java.demo.interfaz.bifunction.ejemplo1;

import java.util.function.BiFunction;

public class EjemploBifunction {

    public static void main(String[] args) {
        BiFunction<String, String,String >    bi  =
                (param1, param2) -> param1+param2;
        System.out.println(bi.apply("hola ","paco"));
    }
}
