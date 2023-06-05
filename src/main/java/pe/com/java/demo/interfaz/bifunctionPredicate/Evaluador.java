package pe.com.java.demo.interfaz.bifunctionPredicate;



import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Evaluador {

    public List<Empleado> evaluar(List<Empleado> listEmp,Predicate<Empleado> eval){
        System.out.println("== lista inicial ==");
//        listEmp.forEach(System.out::println);
    List<Empleado> listaNueva;
        listaNueva=listEmp.stream().filter((eval)).collect(Collectors.toList());
        System.out.println("== lista filtrada ==");
//        listaNueva.forEach(System.out::println);
        return listaNueva;
    }

    public List<Empleado> evaluarAnd(List<Empleado> listEmp, Predicate<Empleado> evaluar){
        System.out.println("==== Inicio del metodo evaluarAnd ====");
        List<Empleado> listAnd;
        listAnd=listEmp.stream().filter(empleado -> evaluar.and
                (empleado1 -> empleado1.getSalario()>2000).test(empleado))
                .toList();

        return listAnd;
    }
}
