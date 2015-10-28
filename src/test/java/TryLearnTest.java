import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Sandman on 28.10.2015.
 */
public class TryLearnTest {

        public void splitString(String s) {
            try {
                if(s.length()>3){
                    throw new ArrayIndexOutOfBoundsException();
                }
                String[] test = s.trim().split("\\s+");
                int k = test[1].length();
                for (int i = 0; i < test.length; i++) {
                    System.out.println(test[i]);
                }
                System.out.println(k);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("vveli stroku >3");
            }
        }

    @Test
    public void splitTest(){
        splitString("+ usd 2888 3");
    }

}

