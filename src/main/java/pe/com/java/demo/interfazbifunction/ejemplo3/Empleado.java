package pe.com.java.demo.interfazbifunction.ejemplo3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Empleado {

    String nombre;
    double salario;
}
