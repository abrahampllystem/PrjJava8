package pe.com.java.demo.referencemethod.util;

import pe.com.java.demo.referencemethod.bean.Persona;

public class ProveedorComparaciones {

    public int compararPorNombre(Persona person1,Persona person2){
        return person1.getNombre().compareTo(person2.getNombre());
    }

    public int compararPorEdad(Persona person1, Persona person2){
        return person1.getEdad().compareTo(person2.getEdad());
    }
}
