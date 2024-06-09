package pe.com.java.demo.examples.example02;

public class LambdaTest {

    public static void main(String[] args) {

        engine((x,y) -> x+y);
        engine((x,y) -> x-y);
        engine((x,y) -> x*y);
        engine((x,y) -> x/y);
    }

    private static void engine(Calculadora calc){
        int x = 2,  y =4;
        int resultado = calc.calc(x,y);
        System.out.println("resultado: "+resultado);
    }

}
