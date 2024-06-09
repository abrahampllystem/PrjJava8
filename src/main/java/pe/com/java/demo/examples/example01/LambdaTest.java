package pe.com.java.demo.examples.example01;

public class LambdaTest {

    public static void main(String[] args) {
        Operaciones op = (num1, num2)-> System.out.println(num1+ num2);


        LambdaTest obj1 = new LambdaTest();
         obj1.miMetodo(
                 ((num1, num2) -> System.out.println(
                         " parametro1: "+num1 + " parametro2 : "+ num2
                 )),1,2);
    }
    
    public void  miMetodo(Operaciones op, int num1, int num2){
        op.operaciones(num1,num2);
    }
}
