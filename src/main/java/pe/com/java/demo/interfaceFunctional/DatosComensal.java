package pe.com.java.demo.interfaceFunctional;

import pe.com.java.demo.interfaceFunctional.bean.Comensal;

import java.util.function.Function;

public class DatosComensal {

    public static void main(String[] args) {
         Comensal com1 = Comensal.builder().nombre("la pepa")
                 .mesa(10)
                 .monto_pedido(20.9).build();
        String nombreCom = getDatoComensal(com1, parm -> parm.getNombre()).toString();
        int mesa =  Integer.valueOf(getDatoComensal(com1, param -> param.getMesa()).toString());
        System.out.println(" El nombre del comensal : " + nombreCom);
        System.out.println("La mesa del comensal es : "+ mesa);
    }
    public static Object  getDatoComensal(
        Comensal com, Function<Comensal, Object> func
    ){
        return func.apply(com);
    }
}
