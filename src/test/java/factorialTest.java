import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sandman on 15.10.2015.
 */
public class factorialTest {
    // метод с рекурсией
    public static long recursiveFact(int n) {
        long r;

        if (n == 0)
            return 1;
        r = recursiveFact(n - 1) * n;
        return r;
    }


    public static long fact(int n){
        // метод без рекурсии
        long r=1;
        for(int i=1;i<=n;i++)
            r=r*i;
        return r;
    }

    @Test
    public void compareTest(){
        long idx1 = fact(4);
        long idx2 = recursiveFact(4);
        Assert.assertTrue(idx1 == idx2);
    }


    @Test
    public void  testFactorialRecursive() {
        org.junit.Assert.assertTrue(recursiveFact(0) == 1);
        org.junit.Assert.assertTrue(recursiveFact(1) == 1);
        org.junit.Assert.assertTrue(recursiveFact(40)>0);

    }


    @Test
    public void  testFactorial() {
        org.junit.Assert.assertTrue(fact(0) == 1);
        org.junit.Assert.assertTrue(recursiveFact(1) == 1);
        org.junit.Assert.assertTrue(fact(40)>0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void  testFactorialNegative() {
        recursiveFact(-1);
        org.junit.Assert.fail();
    }
}
