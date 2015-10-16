/**
 * Created by Sandman on 11.10.2015.
 */
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.fail;


public class seachingTest {

    public static int binarySearch(int[] a, int chislo) {
        int begin = 0;
        int end = a.length;
        while (begin < end) {
            if (chislo > a[end - 1] || chislo < a[begin]) {
                return -1;
            } else {
                int mid = begin + (end - begin) / 2;
                if (chislo < a[mid])
                    end = mid;
                else if (chislo > a[mid])
                    begin = mid;
                else if (chislo == a[mid])
                    return mid;
            }
        }
        return -1;

    }


    @Test
    public void testExistsAll() {
        int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int key : mas) {
            testExists(mas, key);
        }
    }

    private void testExists(int[] mas, int key) {
        int idx = binarySearch(mas, key);
        if (idx == -1) {
            org.junit.Assert.fail("Not found index for key=" + key);
        }
        Assert.assertTrue(mas[idx] == key);
    }


    @Test
    public void testExists() {
        int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int key = 8;
        int idx = binarySearch(mas, key);
        Assert.assertTrue(mas[idx] == key);
    }


    @Test
    public void testBinarySearchForEmptyArray() {
        int[] mas = new int[]{};
        int idx = binarySearch(mas, 1); // IOB exception
        Assert.assertTrue(idx == -1);

    }

    @Test
    public void testNumberNotPartOfArray() {
        int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int idx = binarySearch(mas, 13);
        Assert.assertTrue(idx == -1);
    }


}

