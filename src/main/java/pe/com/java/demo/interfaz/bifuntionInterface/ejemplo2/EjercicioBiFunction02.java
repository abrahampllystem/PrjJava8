package pe.com.java.demo.interfaz.bifuntionInterface.ejemplo2;

import pe.com.java.demo.interfaz.bifuntionInterface.ejemplo1.Calculadora;

public class EjercicioBiFunction02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("resultado : "+
                calculadora.calc((x,y) -> ": "+ (x*y),60,10 ));

        
    }
}
