package pe.com.java.demo.stream.ejemplo04;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CrearStream04 {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();


        IntStream stream = entrada.chars();
        stream.filter(n -> !Character.isDigit((char)n)
            && !Character.isWhitespace((char) n ))
                .forEach(n -> System.out.println((char) n));*/

        String str= "HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::println);
    }
}
