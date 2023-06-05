package pe.com.java.demo.interfaz.bipredicate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Empleado {

    private String nombre;
    private Integer edad;
    private double salario;
    private String departamento;

}
