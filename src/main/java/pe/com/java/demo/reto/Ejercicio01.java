package pe.com.java.demo.reto;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio01 {

    public static void main(String[] args) {

    List<String> lista  = carga();

        lista.stream().filter(n -> n.split( " ").length==3
                        && n.toLowerCase()
                .chars().filter(c -> c=='n').count()>=2
                        && n.toLowerCase()
                .chars().filter(s -> s=='s').count()<=1
                        && n.toLowerCase()
                .chars().filter(d -> d== 'd').count()==1)
                .map(mapa -> new StringBuilder(mapa.split(" ")[1]).reverse().toString())
                .filter(filtro -> filtro.length()==5)
                .sorted()
                .filter(n -> (n.toLowerCase().chars().filter(s1-> s1== 'l').count()==1))
                .map(filtro1 -> new StringBuilder(filtro1).reverse().toString())
//                .map(mapa -> new StringBuilder(mapa.split(" ")[1])).sorted()

                .forEach(System.out::println);
        

    }


    public static List<String> carga(){
        List<String> lista= Arrays.asList
                ("Aarón Ander Joaquín",
                        "Abel Andrés Joel",
                        "Abelardo Ángel Jon",
                        "Abraham Aníbal Jordi",
                        "Adalberto Antonio Jorge",
                        "Adam Arnau José",
                        "Adán Arturo Jose Antonio",
                        "Adiran Asier Jose Luis",
                        "Adolfo Augusto Jose Manuel",
                        "Adrià Aurelio Jose Maria",
                        "Adrián Baltasar Juan",
                        "Agustín Bartolomé Blas",
                        "Aimar Basilio Juan Antonio",
                        "Aitor Benito Boris",
                        "Alano Benjamín Juan Carlos",
                        "Alberto Bernardo Borja",
                        "Aldo Bienvenido Brahim",
                        "Aleix Blas Brais",
                        "Alejandro Boris Bruno",
                        "Alejo Borja Calisto",
                        "Alex Brahim Juan José",
                        "Alfonso Brais Camilo",
                        "Alfredo Bruno Juan Manuel",
                        "Alonso Calisto Carlos",
                        "Álvaro Camilo Julio",
                        "Amadeo Carlos Cayetano",
                        "Amado Cayetano César",
                        "Amando César Christian",
                        "Ambrosio Christian Claudio",
                        "Amin Claudio Clemente",
                        "Anastasio Clemente Conrado",
                        "Ander Conrado Constantino",
                        "Constantino Francisco Javier Joel",
                        "Crispín Francisco José Jon",
                        "Cristian Gabriel Jordi",
                        "Daniel Gaspar Jorge",
                        "Darío Gerard José",
                        "David Gerardo Jose Antonio",
                        "Desiderio Germán Jose Luis",
                        "Diego Gonzalo Jose Manuel",
                        "Dionisio Gregorio Jose Maria",
                        "Domingo Guillem Juan",
                        "Donato Guillermo Juan Antonio",
                        "Edgar Gustavo Juan Carlos",
                        "Edmundo Hamza Juan José",
                        "Eduardo Héctor Juan Manuel",
                        "Elías Honorato Julio",
                        "Eloy Hugo Justino",
                        "Emilio Humberto Justo",
                        "Eneko Ibai Kevin",
                        "Enrique Ibrahim Kilian",
                        "Eric Ignacio Leo",
                        "Ernesto Iker Leopoldo",
                        "Esteban Isidoro Lorenzo",
                        "Eugenio Ismael Louis",
                        "Eusebio Ivo Lucas",
                        "Fabián Izan Luciano",
                        "Federico Jaime Luis",
                        "Felipe Jan Macario",
                        "Félix Jaume Manuel",
                        "Fermín Javier Marc",
                        "Fernando Jesús Marcelo",
                        "Fidel Joan Marco",
                        "Francisco Joaquín Marcos",
                        "Marcos Pau Tomás",
                        "Mariano Pedro Ulises",
                        "Mario Pelayo Unai",
                        "Marti Plácido Urbano",
                        "Martín Platón Valentín",
                        "Mateo Pol Vicente",
                        "Matías Ponce Víctor",
                        "Mauricio Quintín Virgilio",
                        "Maximiliano Rafael Walter",
                        "Máximo Ramiro Wen",
                        "Miguel Ramón Xabier",
                        "Miguel Ángel Raúl Xavier",
                        "Mikel Ricardo Ximen",
                        "Mohamed Roberto Yerai",
                        "Moisés Rodrigo Yeray",
                        "Nabil Rogelio Yunes",
                        "Narciso Román Yusef",
                        "Nathan Rubén Zacarías",
                        "Nicolás Salvador Zenon",
                        "Noé Samuel Zoilo",
                        "Octavio Santiago",
                        "Oier Sebastián",
                        "Omar Sergi",
                        "Oriol Sergio",
                        "Óscar Silvestre",
                        "Pablo Simón",
                        "Pancho Teodoro");
            return lista;
    }
}
