package pe.com.java.demo.referencemethod.ejemplo1.bean;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private String nombre;
    private  Integer edad;
    private String email;


    @Override
    public String toString() {
        return "nombre= " + nombre + ", edad=" + edad ;
    }

    public static int compararPorEdad(Persona a, Persona b){
        return a.getEdad().compareTo(b.getEdad());
    }


    public int comparadorEdad2(Persona pers){
        return this.getEdad().compareTo(pers.getEdad());
    }
}
