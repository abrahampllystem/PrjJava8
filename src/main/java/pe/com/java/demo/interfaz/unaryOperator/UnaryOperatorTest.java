package pe.com.java.demo.interfaz.unaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

    public static void main(String[] args) {
        List<Integer> lista= Arrays.asList(
                10,20,30,40,50,60,70,80,90,100  
        );


        List<Integer> listUpdate = operadorUnary(num -> mult(num), lista);

        listUpdate.forEach(System.out::println);
    }


    public static List<Integer> operadorUnary(UnaryOperator<Integer> unaryOpt, List<Integer> list) {

        List<Integer> listActualizada= new ArrayList<>();

        list.forEach(
                num -> listActualizada.add(unaryOpt.apply(num))
        );
        return listActualizada;
        
    }

    public static Integer mult(Integer num1){
        return num1*num1;
    }
}
