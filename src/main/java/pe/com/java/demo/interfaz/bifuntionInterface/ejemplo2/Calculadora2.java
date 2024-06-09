package pe.com.java.demo.interfaz.bifuntionInterface.ejemplo2;

import pe.com.java.demo.interfaz.bifuntionInterface.bean.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2 {

    public List<Double> calc(BiFunction<Double, Double,Double> bi, List<Empleado> listEmp, Double incremento){

        List<Double> listSalarios= new ArrayList<>();

        for (Empleado empleado: listEmp ){
            listSalarios.add(bi.apply(empleado.getSalario(), incremento));
        }
      return listSalarios;
        
    }
}
