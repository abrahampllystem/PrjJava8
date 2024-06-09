package pe.com.java.demo.referencemethod.bean;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Persona implements  Comparable<Persona>{

    private String nombre;
    private  Integer edad;
    private String email;


    @Override
    public int compareTo(Persona o) {
            int result = this.nombre.compareTo(o.nombre);
        return 0;
    }
}
