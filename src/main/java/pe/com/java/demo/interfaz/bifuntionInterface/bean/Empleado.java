package pe.com.java.demo.interfaz.bifuntionInterface.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Empleado {

    private  String nombre;
    private double salario;
    
    

}
