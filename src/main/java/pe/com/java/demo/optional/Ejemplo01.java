package pe.com.java.demo.optional;

import java.util.Optional;

public class Ejemplo01 {

    public static void main(String[] args) {
         String texto=null;
//         String texto="";
//         String texto="nulo";
         Optional<String> optexto= Optional.ofNullable(texto);
         if (optexto.isPresent()) {
             System.out.println("si esta presente el valor : "+ optexto.map(String::toUpperCase).get());
         } else{
             System.out.println(" no esta presente el valor:"+ optexto.isPresent());
         }

         if(optexto.isEmpty()){
             System.out.println("el valor viene vacio :"+ optexto.isEmpty());
             String vacio=optexto.map(String::toLowerCase).orElseGet(() ->"vacio");
             System.out.println("valor vacio: "+ vacio);
         } else {
             System.out.println("el valor no viene vacio = "+ optexto.isEmpty());
             String novacio=optexto.map(String::toLowerCase).orElseGet(() ->"vacio");
             System.out.println("valor novacio: "+ novacio);
         }
                           

    }
}
