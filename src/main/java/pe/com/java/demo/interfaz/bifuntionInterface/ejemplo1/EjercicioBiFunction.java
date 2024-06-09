package pe.com.java.demo.interfaz.bifuntionInterface.ejemplo1;

import java.util.function.BiFunction;

public class EjercicioBiFunction {

    public static void main(String[] args) {
        BiFunction<String, String, String>  biFunction = (x,y)-> x+y;
        System.out.println(biFunction.apply("Hola ","Mundo"));
    }
}
