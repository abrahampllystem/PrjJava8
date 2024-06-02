package pe.com.java.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class PrjJava8ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test_order_inversa(){

        List<String> listString=
                Arrays.asList("Juan", "Antonia", "Pedro");

        Comparator<String> comparatorLenght= (obj1, obj2) -> obj2.length() - obj1.length();

        Assertions.assertNotNull(comparatorLenght,"no hay comparador");
        Collections.sort(listString, comparatorLenght);

        Assertions.assertEquals("Antonia", listString.get(0),"first element must is Antonia");

        
    }

}
