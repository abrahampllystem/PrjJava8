package pe.com.java.demo.referencemethod.ejemplo2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * ejemplo referencia a constructor
 */
public class EjemploNew {

    public static void main(String[] args) {
        List<String> numeros = Arrays.asList(
                "10","10","15","15","25","30","40","6","30"
        );

        getResults(numeros, Integer::parseInt).forEach(
                EjemploNew::multiplicarPor10);

    }

    public static List<Integer> getResults(List<String> listString, Function<String, Integer> funct){

        List<Integer> result= new ArrayList<>();
        listString.forEach(
                cadena -> result.add(funct.apply(cadena))
        );

        return result;
    }

    public static void multiplicarPor10(int number){
        System.out.println("el nuevo valor del dato "+ number+ " es "+ (number*10));
    }
}
