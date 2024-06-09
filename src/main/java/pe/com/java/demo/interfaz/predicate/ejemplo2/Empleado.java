package pe.com.java.demo.interfaz.predicate.ejemplo2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

}
