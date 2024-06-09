package pe.com.java.demo.interfaz.consumer.ejemplo02.bean;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    private String nombre;
    private double calificacion;
}
