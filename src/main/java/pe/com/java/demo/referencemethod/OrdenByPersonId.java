package pe.com.java.demo.referencemethod;

import pe.com.java.demo.referencemethod.bean.Persona;

import java.util.Comparator;

public class OrdenByPersonId implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getEdad().compareTo(o2.getEdad());
    }
}
