package pe.com.java.demo.interfaz.comparator.bean;

import lombok.*;
import pe.com.java.demo.referencemethod.bean.Persona;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Empleado {

    private String nombre;
    private int id;
    private LocalDate date;

    public static int comparadorPorEdad(Persona a, Persona b){
        return a.getEdad().compareTo(b.getEdad());
    }
}
