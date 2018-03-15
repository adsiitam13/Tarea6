package mapreduce;

import java.util.Collection;
import static java.util.Arrays.asList;

public class MapReduce {
    
    public static int palabras(Collection<String> lista){
        return  lista.stream().map(line->line.split((" "))).mapToInt(s->s.length).reduce(0,(x,y)->x+y);

    }
    
    
    public static void main(String[] args) {
        
        Collection<String> lista=asList("Hola como estas","El cielo es azul","perro");
         
         
        int total=palabras(lista);
        
        
        System.out.println("En total hay "+total+" palabras en la lista");
    }
    
}