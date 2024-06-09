package pe.com.java.demo.stream.ejemplo02;

import pe.com.java.demo.stream.ejemplo02.bean.Estudiante;

import java.util.stream.Stream;

public class CreaStream01 {

    public static void main(String[] args) {

        //cadena();
        //stringObject();
        stringMethod();
    }
    public static void StreamofArray(){

        String [] arreglo = {"java","c++","c#","ruby","python"};
        Stream<String> stream3 =  Stream.of(arreglo);
        stream3.forEach(System.out::println);
    }


    public static void cadena(){
        Stream<String> stream1= Stream.of("Curso de programación");
        stream1.forEach(System.out::println);
        Stream<String> stream2 = Stream.of("curso1","curso2","curso3","curso4");

        stream2.forEach(System.out::println);
    }
    public static void stringObject(){

        Stream<Estudiante> streamStudent = Stream.<Estudiante>builder()
                .add(Estudiante.builder()
                        .identificación("n01")
                        .promedio(18)
                        .altura(1.60)
                        .edad(12)
                        .build())
                .add(Estudiante.builder()
                        .identificación("n02")
                        .promedio(10)
                        .altura(1.60)
                        .edad(14)
                        .build())
                .add(Estudiante.builder()
                        .identificación("n03")
                        .promedio(12)
                        .altura(1.80)
                        .edad(16)
                        .build())
                .build();

        streamStudent.forEach(student -> System.out.println("Id de estudiante :" + student.getIdentificación()));
    }

    public static void stringLong(){
        Stream<Long> firstTen = Stream.iterate(1L,n-> n+1)
                .limit(10);
        firstTen.forEach(System.out::println);
    }

    public static void stringMethod(){
        Stream.iterate(1l, n->n+1)
                .filter(n -> n%2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);
    }

    
}
