package pe.com.java.demo.interfaz.predicate.ejemplo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Evaluador {

    public List<Empleado> evaluar(List<Empleado> listEmp,
                                 Predicate<Empleado> eval){
        System.out.println("== lista inicial ==");
        listEmp.forEach(System.out::println);
    List<Empleado> listaNueva = new ArrayList<>();
        listaNueva=listEmp.stream().filter((empleado ->  eval.test(empleado)))
                .collect(Collectors.toList());
        System.out.println("== lista filtrada ==");
//        listaNueva.forEach(System.out::println);
        return listaNueva;
    }
}
