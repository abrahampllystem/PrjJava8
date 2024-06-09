package pe.com.java.demo.interfaz.consumer.ejemplo02;

import pe.com.java.demo.interfaz.consumer.ejemplo02.bean.Estudiante;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {

    public static void main(String[] args) {
        List<Estudiante> listStudents = carga();
        OperacionEstudiantes op = new OperacionEstudiantes();
        Consumer<Estudiante> consStudent1= student -> System.out.println("nombre: "+
        student.getNombre()+ " Calificacion: "+ student.getCalificacion());

        System.out.println("\nEstudiantes sin calificacion actualizada");
        op.aceptaTodos(listStudents,consStudent1);
//      listStudents.forEach(consStudent);
        Consumer<Estudiante> consStudent2=  estudiante -> estudiante.setCalificacion(estudiante.getCalificacion()*1.15);

//        op.aceptaTodos(listStudents, consStudent2);


//        op.aceptaTodos(listStudents,consStudent1);

        Consumer<Estudiante> consStudent3 = consStudent2.andThen(consStudent1);

        System.out.println("\nEstudiante con calificacion actualizada");
        op.aceptaTodos(listStudents,consStudent3);
        
        
        
    }


    public static List<Estudiante> carga(){
        List<Estudiante> listStudents= Arrays.asList(
                Estudiante.builder().nombre("jhon").calificacion(6).build(),
                Estudiante.builder().nombre("mark").calificacion(5).build(),
                Estudiante.builder().nombre("felix").calificacion(5).build(),
                Estudiante.builder().nombre("patrick").calificacion(6).build(),
                Estudiante.builder().nombre("james").calificacion(3).build(),
                Estudiante.builder().nombre("peter").calificacion(10).build(),
                Estudiante.builder().nombre("mathew").calificacion(10).build(),
                Estudiante.builder().nombre("paul").calificacion(9).build(),
                Estudiante.builder().nombre("james").calificacion(5).build(),
                Estudiante.builder().nombre("judas").calificacion(4).build(),
                Estudiante.builder().nombre("felipe").calificacion(7).build(),
                Estudiante.builder().nombre("tom").calificacion(6).build(),
                Estudiante.builder().nombre("maria").calificacion(7).build(),
                Estudiante.builder().nombre("magdala").calificacion(7).build(),
                Estudiante.builder().nombre("javier").calificacion(7).build(),
                Estudiante.builder().nombre("amanda").calificacion(8).build(),
                Estudiante.builder().nombre("amada").calificacion(6).build(),
                Estudiante.builder().nombre("olivia").calificacion(9).build(),
                Estudiante.builder().nombre("cinthia").calificacion(9).build(),
                Estudiante.builder().nombre("felicitas").calificacion(10).build(),
                Estudiante.builder().nombre("marcela").calificacion(5).build(),
                Estudiante.builder().nombre("arturo").calificacion(2).build(),
                Estudiante.builder().nombre("advías").calificacion(10).build()



        );
        return listStudents;
    }
}
