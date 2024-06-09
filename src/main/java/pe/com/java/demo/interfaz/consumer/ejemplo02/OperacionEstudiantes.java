package pe.com.java.demo.interfaz.consumer.ejemplo02;

import pe.com.java.demo.interfaz.consumer.ejemplo02.bean.Estudiante;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {


    public void aceptaTodos(List<Estudiante> listStudents, Consumer<Estudiante> consumer){

        listStudents.forEach(consumer::accept);
        
    }
}
