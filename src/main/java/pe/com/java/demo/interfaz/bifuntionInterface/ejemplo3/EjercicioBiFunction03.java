package pe.com.java.demo.interfaz.bifuntionInterface.ejemplo3;

import pe.com.java.demo.interfaz.bifuntionInterface.bean.Empleado;
import pe.com.java.demo.interfaz.bifuntionInterface.ejemplo2.Calculadora2;

import java.util.List;

public class EjercicioBiFunction03 {

    public static void main(String[] args) {
        List<Empleado> listEmployee = List.of(
                Empleado.builder().nombre("carlos").salario(2658.5).build(),
                Empleado.builder().nombre("pedro").salario(4658.5).build(),
                Empleado.builder().nombre("juan").salario(6658.5).build(),
                Empleado.builder().nombre("julio").salario(8658.5).build(),
                Empleado.builder().nombre("pablo").salario(10658.5).build(),
                Empleado.builder().nombre("ronaldo").salario(20658.5).build(),
                Empleado.builder().nombre("miryan").salario(110658.5).build()
        );

        Calculadora2 cal=  new Calculadora2();
        List<Double> listIncrement = cal.calc((salario, incremento) ->salario+ (salario* (incremento/100)), listEmployee,19.0);
        System.out.println("salario incrementados");

        listEmployee.stream().forEach(
                x -> {
                    System.out.println("el nuevo salario de "+ x.getNombre()+ " es :"+
                            listIncrement.stream().map(saldo -> Double.valueOf(saldo)))
                ;}

                );
        
        //listIncrement.stream().forEach((x,li) -> System.out.println("nuevo salario : " + x));
    }
}
