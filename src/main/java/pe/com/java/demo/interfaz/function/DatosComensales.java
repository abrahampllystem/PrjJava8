package pe.com.java.demo.interfaz.function;

import pe.com.java.demo.interfaz.function.bean.Comensal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {

    public static void main(String[] args) {
        List<Comensal> listaComensales =
                List.of(Comensal.builder().nombre("Javier").mesa(10).monto_pedido(5).build()
                        , Comensal.builder().nombre("Pablo").mesa(20).monto_pedido(52).build()
                        , Comensal.builder().nombre("Pedro").mesa(30).monto_pedido(52).build());

        List<Object> nombreComensales = getDataComensales(listaComensales, comensal  -> comensal.getNombre());

        List<Object> montoComensales = getDataComensales(listaComensales, comensal ->  comensal.getMonto_pedido());

//        nombreComensales
//                .stream().forEach(o -> System.out.println("La lista de nombre es :"+o));
        String mensajeNombreComensale = "La lista de nombre es :";
        String mensajeMontoComensales = "El monto  es :";
        nombreComensales.stream().forEach(o -> print(o, mensajeNombreComensale));
        montoComensales.stream().forEach(o -> print(o, mensajeMontoComensales));

    }

    public static void print (Object obj, String message){
        System.out.println(message + obj);
    }
    public static List<Object> getDataComensales(
            List<Comensal> listCom, Function<Comensal, Object> func)

    {
        // Lista que almacena datos de los comensales
          List<Object> listaDatos = new ArrayList<>();
          for(Comensal comensal : listCom){
              listaDatos.add(func.apply(comensal));
          }
          return listaDatos;
    }
}
