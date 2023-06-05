package pe.com.java.demo.interfaz.bifunction.ejemplo3;

import java.util.List;

public class EjercicioBiFunction3 {

    public static void main(String[] args) {
        List<Empleado> listEmpleados =
                List.of(Empleado.builder().nombre("javier").salario(2563.2).build(),
                        Empleado.builder().nombre("arturo").salario(183.2).build(),
                        Empleado.builder().nombre("carlos").salario(2648879.2).build(),
                        Empleado.builder().nombre("jimena").salario(2546.2).build(),
                        Empleado.builder().nombre("raul").salario(2522.2).build(),
                        Empleado.builder().nombre("raimero").salario(254.2).build(),
                        Empleado.builder().nombre("saul").salario(23.2).build(),
                        Empleado.builder().nombre("jaime").salario(25553.2).build(),
                        Empleado.builder().nombre("flor").salario(2123543.2).build(),
                        Empleado.builder().nombre("mirna").salario(321653.2).build());

        Calculadora2 objCalculadora2 = new Calculadora2();
        List<Double> objsalario =
        objCalculadora2.calc((salario, incremento)
                -> salario + (salario * (incremento/100))
                , listEmpleados, 16.0);

        objsalario.stream().forEach(System.out::println);
        

    }
}
