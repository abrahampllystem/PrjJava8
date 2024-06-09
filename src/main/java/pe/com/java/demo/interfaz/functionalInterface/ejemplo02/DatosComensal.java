package pe.com.java.demo.interfaz.functionalInterface.ejemplo02;

import pe.com.java.demo.interfaz.functionalInterface.ejemplo02.bean.Comensal;

import java.util.function.Function;

public class DatosComensal {

    public static void main(String[] args) {
        Comensal com= new Comensal("pedro",23.2,10);
        String nombreComensal= (String) getDatoComensal(com,
                x-> x.getNombre());

        System.out.println("el nombre del comensal es: "+ nombreComensal);

        int mesa = (int)getDatoComensal(com, x-> x.getMesa());
        System.out.println("el numero de la mesa es: "+ mesa);
        
    }

    public static Object getDatoComensal(Comensal com, Function<Comensal,Object> func){
        return func.apply(com);
    }
}
