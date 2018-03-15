package mapreduce;

import static java.util.Arrays.asList;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapReduceTest {
    
    public MapReduceTest() {
        
        
    }

    @Test
    public void testPalabras() {
        System.out.println("prueba");
        Collection<String> lista=asList("Hola como estas","El cielo es azul","perro");
        int expRes=8;
        int res=MapReduce.palabras(lista);
        assertEquals(expRes,res);
    }
    
}

