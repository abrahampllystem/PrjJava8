package pe.com.java.demo.collectrs.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Setter
@Getter
public class Empleado {


    private String nombre;
    private int edad;
    private String dni;
    private LocalDate fechaNacimiento;
    private boolean sexo;
}
