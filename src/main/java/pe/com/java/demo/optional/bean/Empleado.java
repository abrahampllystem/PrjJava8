package pe.com.java.demo.optional.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Empleado {

    private String nombre;
    private String apellido;
}
