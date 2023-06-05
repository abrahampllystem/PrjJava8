package pe.com.java.demo.interfaz.bipredicate;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Evaluador {


    public List<Empleado> evaluarPredicateOr(List<Empleado> listEmpleado,
                                             BiPredicate<Integer,String> objBiPrediate){
        System.out.println("== lista inicial ==");

        List<Empleado> listNueva;



        
        listNueva=listEmpleado.stream().filter(empleado ->
                objBiPrediate.test(empleado.getEdad(),empleado.getDepartamento())).collect(Collectors.toList());

        return  listNueva;



    }
}
