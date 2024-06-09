package pe.com.java.demo.interfaz.consumer.ejemplo01;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {
        Consumer<String> objConsumer =
                x -> System.out.println(x.toUpperCase());


        objConsumer.accept("javier");

    }
}
