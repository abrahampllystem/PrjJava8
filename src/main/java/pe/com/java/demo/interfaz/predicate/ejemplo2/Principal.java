package pe.com.java.demo.interfaz.predicate.ejemplo2;

import java.util.List;

public class Principal {
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
                Empleado.builder().nombre("javier").edad(35).salario(600).departamento("cobranzas").build());

        Evaluador objEvaluador = new Evaluador();

        List<Empleado> listAltos =  objEvaluador.evaluar(listEmple,
                empleado -> empleado.getSalario()>5000);

        System.out.println("\nEmpleados con salario > 5000");
        listAltos.forEach(
                x -> System.out.println("nombre de empleado :"+ x.getNombre())
        );



        List<Empleado> listStartWithJ = objEvaluador.evaluar(listEmple,
                empleado -> empleado.getNombre().startsWith("j"));

        System.out.println("\nEmpleado que su nombre inicia con j");
        listStartWithJ.forEach(z -> System.out.println(z.getNombre()));



        List<Empleado> employeeYoung= objEvaluador.evaluar(listEmple,
                empleado -> empleado.getEdad()<25);

        System.out.println("\nEmpleados Jovenes: ");
        employeeYoung.forEach(young -> System.out.println(young.getNombre()));


    }
}
