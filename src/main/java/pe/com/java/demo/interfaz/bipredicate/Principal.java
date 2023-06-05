package pe.com.java.demo.interfaz.bipredicate;



import java.util.List;
import java.util.function.BiPredicate;

public class Principal {

    /**
     * se requiere obtener un reporte con todos los empleados que cumplan
     * con alguno de estos conjuntos de criterios
     * 1)25 años en adelante y que esta en el departamento de ventas o
     * 2)25 años en adelante y que esten en mostrador
     * @param args
     */
    public static void main(String[] args) {
        List<Empleado> listEmple =
                List.of(Empleado.builder().nombre("rodrigo").edad(25).salario(1500).departamento("cobranzas").build(),
                Empleado.builder().nombre("alicia").edad(25).salario(1500).departamento("ventas").build(),
                Empleado.builder().nombre("manolo").edad(30).salario(1500).departamento("ventas").build(),
                Empleado.builder().nombre("cinthia").edad(20).salario(2500).departamento("mostrador").build(),
                Empleado.builder().nombre("esteban").edad(19).salario(7000).departamento("ventas").build(),
                Empleado.builder().nombre("damaris").edad(32).salario(600).departamento("telemarketing").build(),
                Empleado.builder().nombre("lina").edad(25).salario(2500).departamento("mostrador").build(),
                Empleado.builder().nombre("nayeli").edad(44).salario(10000).departamento("ventas").build(),
                Empleado.builder().nombre("flor").edad(35).salario(7000).departamento("compras").build(),
                Empleado.builder().nombre("german").edad(20).salario(1500).departamento("facturacion").build(),
                Empleado.builder().nombre("lidia").edad(21).salario(600).departamento("telemarketing").build(),
                Empleado.builder().nombre("eleazar").edad(33).salario(600).departamento("cobranzas").build(),
                Empleado.builder().nombre("paola").edad(50).salario(1500).departamento("compras").build(),
                Empleado.builder().nombre("ignacio").edad(41).salario(1500).departamento("compras").build(),
                Empleado.builder().nombre("rodrigo").edad(40).salario(7000).departamento("recursoshumanos").build(),
                Empleado.builder().nombre("gerardo").edad(19).salario(5222).departamento("mostrador").build(),
                Empleado.builder().nombre("noe").edad(43).salario(1500).departamento("cobranzas").build(),
                Empleado.builder().nombre("richard").edad(34).salario(6500).departamento("mostrador").build(),
                Empleado.builder().nombre("javier").edad(35).salario(600).departamento("cobranzas").build());


        Evaluador objEvaluador = new Evaluador();
        BiPredicate<Integer,String> firstFilter =
                (edad,departamento) ->(edad>=25) && (departamento.equals("ventas"));

        BiPredicate<Integer,String> secondFilter =
                (edad,departamento) ->(edad>=25) && (departamento.equals("mostrador"));


        BiPredicate<Integer,String> criterio = firstFilter.or(secondFilter);

        System.out.println("==  REQ01 ==");

        List<Empleado> listUpdate =objEvaluador.evaluarPredicateOr(listEmple,criterio);

        listUpdate.forEach(System.out::println);

        



    }
}
