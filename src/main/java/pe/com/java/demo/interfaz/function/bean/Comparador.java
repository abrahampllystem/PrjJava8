package pe.com.java.demo.interfaz.function.bean;

@FunctionalInterface
public interface Comparador <T>{
    int compare(T o1,T o2);
    boolean  equals(Object obj);
}
