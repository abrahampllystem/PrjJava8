package pe.com.java.demo.interfaz.functionalInterface.ejemplo02;

import pe.com.java.demo.interfaz.functionalInterface.ejemplo02.bean.Comensal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {

    public static void main(String[] args) {
        List<Comensal> listaComensales
                = Arrays.asList(
                        Comensal.builder()
                                .nombre("pedro")
                                .monto_pedido(22.0)
                                .mesa(9)
                                .build(),
                Comensal.builder()
                        .nombre("jose")
                        .mesa(10)
                        .monto_pedido(20.0)
                        .build(),
                Comensal.builder()
                        .mesa(8)
                        .monto_pedido(18.9)
                        .nombre("pablo")
                        .build(),
                Comensal.builder()
                        .nombre("piero")
                        .monto_pedido(27.0)
                        .mesa(7)
                        .build()
        );


        List<Object> nombreComensale = getDatosComensal(listaComensales,
                x -> x.getNombre()
                );


        System.out.println("la lista de comensales");

        nombreComensale.stream().forEach(
                x -> System.out.println("El nombre es : "+x));

        List<Object> mesaComensal = getDatosComensal(listaComensales,
                x -> x.getMesa()
        );

        System.out.println("================");
        mesaComensal.stream().forEach(
                x -> System.out.println("El numero de la mesa es  : "+x));
        
    }
    public static List<Object> getDatosComensal(List<Comensal> listCom, Function<Comensal,Object> func){

        List<Object> listaDatos = new ArrayList<>();
        listCom.forEach(x->
                listaDatos.add(func.apply(x)));
        return listaDatos;
    }




}
