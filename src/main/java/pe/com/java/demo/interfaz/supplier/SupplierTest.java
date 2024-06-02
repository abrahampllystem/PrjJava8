package pe.com.java.demo.interfaz.supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> i =() -> "Javier";
        System.out.println("el valor pasado " + i.get());
    }
}
