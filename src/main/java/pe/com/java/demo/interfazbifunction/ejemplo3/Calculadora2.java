package pe.com.java.demo.interfazbifunction.ejemplo3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2 {

    public List<Double> calc(BiFunction<Double, Double, Double> bfunction,
                       List<Empleado> lstEmployee, Double incremento){
        System.out.println("Ingreso de valores ");
        
        List<Double> listSalarios = new ArrayList<>();

         lstEmployee.forEach(obj -> listSalarios.add(bfunction.apply(obj.getSalario(), incremento)));

       return listSalarios;

    }
}
