package pe.com.java.demo.interfazbifunction.ejemplo2;

public class EjercicioBiFunction2 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("resultado "+ calculadora.calc((x,y) -> ":"+ (x * y),30,40));

    }
}
