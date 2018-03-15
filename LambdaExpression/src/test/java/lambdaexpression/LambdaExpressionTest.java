
package lambdaexpression;

import static java.util.Arrays.asList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LambdaExpressionTest {
    
    public LambdaExpressionTest() {
    }

    @Test
    public void testFiltrar() {
        System.out.println("filtrar");
        lambdaexpression.Test prueba = (n)->(n%2)==0;
        Collection<Integer> lista = asList(2,3,4,18,5);
        Collection<Integer> expResult = asList(2,4,18);
        Collection<Integer> result = LambdaExpression.filtrar(prueba, lista);
        Assert.assertArrayEquals("No funciona",expResult.toArray(), result.toArray());
    }
    
}
