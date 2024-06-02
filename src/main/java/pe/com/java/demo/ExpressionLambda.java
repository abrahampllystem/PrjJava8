package pe.com.java.demo;

public class ExpressionLambda {

    public static void main(String[] args) {
        FunctionTest ft = () -> System.out.println("hola prueba");
//          ft.saludar();
    ExpressionLambda obj = new ExpressionLambda();
    obj.miMetodo(ft);
    }


    public void miMetodo(FunctionTest  param){
        param.saludar();
    }


}


interface  FunctionTest{
    public void saludar();
}
