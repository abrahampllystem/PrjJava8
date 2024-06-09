package pe.com.java.demo.stream.ejemplo02.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Estudiante {
    private String identificación;
    private int edad;
    private double altura;
    private double promedio;
}
