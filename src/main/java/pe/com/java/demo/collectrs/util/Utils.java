package pe.com.java.demo.collectrs.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {


    public LocalDate stringtoDate(String fecha){
        DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy/MM/d");
        return LocalDate.parse(fecha, format);
    }
}
