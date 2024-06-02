package pe.com.java.demo.interfaz.functionalInterface.ejemplo02.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Comensal {


    private String nombre;
    private double monto_pedido;
    private int mesa;
}
