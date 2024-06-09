package pe.com.java.demo.interfaz.bifunctionPredicate;

import java.util.function.BiFunction;

public class Funciones {


    public double incrementoSalario(Empleado objEmp, double incremento, BiFunction<Double, Double, Double > bifunction){
         return bifunction.apply(objEmp.getSalario(), incremento);
    }
}
