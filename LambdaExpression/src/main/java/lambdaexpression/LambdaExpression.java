package lambdaexpression;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collection;

public class LambdaExpression {
    
    public static Collection<Integer> filtrar(Test prueba,Collection<Integer> lista){
        Collection<Integer> res=new ArrayList<>();
        
        for(int n: lista){
            if(prueba.test(n))
                res.add(n);
        }
        
        return res;
    }

    public static void main(String[] args) {
        Collection<Integer> lista=asList(2,3,4,18,5);//asList(1,5,2,14,17,21,29,30,35);
        System.out.println("LISTA ORIGINAL");
        System.out.println(lista.toString());
        
        // creamos una instancia de Test que ve si un número es impar;
        Test impares=(n)->(n%2)!=0;
        
        
        
        Collection<Integer> listaFinal=filtrar(impares,lista);
        
        System.out.println("\nLISTA FINAL");
        System.out.println(listaFinal.toString());
    }
    
}
