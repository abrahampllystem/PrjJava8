package pe.com.java.demo.interfaz.predicate.ejemplo1;

import java.util.function.Predicate;

public class TestPredicate1 {

    public static void main(String[] args) {
        Predicate<Integer>  objPredicate = (valor) ->valor>0;
        System.out.println(objPredicate.test(123));
    }
}
