import java.util.Scanner;

/**
 * Created by Sandman on 28.10.2015.
 */
public class TryLearn {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();
        String[] test = string.trim().split("\\s+");
            for (int i = 0; i <test.length ; i++) {
                System.out.println(test[i]);

            }
        }
    }
