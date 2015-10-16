import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sandman on 15.10.2015.
 */
public class factorialTest {
    // метод с рекурсией
    public static int recursiveFact(int n) {
        int r;

        if (n == 1)
            return 1;
        r = recursiveFact(n - 1) * n;
        return r;
    }


    public static int fact(int n){
        // метод без рекурсии
        int r=1;
        for(int i=1;i<=n;i++)
            r=r*i;
        return r;
    }

    @Test
    public void compareTest(){
        int idx1 = fact(4);
        int idx2 = recursiveFact(4);
        Assert.assertTrue(idx1 == idx2);
    }
}
