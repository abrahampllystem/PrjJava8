package pe.com.java.demo.problems;

import java.util.List;

public class Example01 {

    public static void main(String[] args) {

        List<String> listString = List.of("Juan", "Antonia","Pedro");

        listString.stream().sorted((n1,n2) -> n1.length() - n2.length());


        System.out.println(listString);
    }
}
