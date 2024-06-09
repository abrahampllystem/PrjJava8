package pe.com.java.demo.collectrs;

import pe.com.java.demo.collectrs.bean.Empleado;
import pe.com.java.demo.collectrs.util.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OpReduccion {

    public static void main(String[] args) {

        

    }
    

    public static void ejemplo02(){

    }

    public static void ejemplo01(){
        List<Empleado> initList = carga();

        ArrayList<?> lista= initList.stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new,ArrayList::add, ArrayList::addAll);


        lista.forEach(System.out::println);
    }

    public static List<Empleado> carga() {

        Utils utils= new Utils();
        List<Empleado> lista = List.of(Empleado.builder().nombre("paco").dni("12345678").edad(20).sexo(true).fechaNacimiento(utils.stringtoDate("2002/02/24")).build(),
                Empleado.builder().nombre("laura").dni("12345668").edad(24).sexo(false).fechaNacimiento(utils.stringtoDate("2020/02/24")).build(),
                Empleado.builder().nombre("maria luisa").dni("12345679").edad(26).sexo(true).fechaNacimiento(utils.stringtoDate("2000/03/07")).build()
                );

        return lista;

    }
}
