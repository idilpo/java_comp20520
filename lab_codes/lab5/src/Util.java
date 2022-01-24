import java.util.Random;
import java.util.Scanner;

public class Util {

    private static Random rand;
    private static Scanner in;

    public static int getRandom(int i) {
        if (rand == null) { //bc there are no constructors in this class, rand will initially be null
            rand = new Random();  //changing the null
        }
        return rand.nextInt(11) + 1; //bound is non-inclusive upper bound so gotta add 1
    }

    public static void out(Object obj) {System.out.println(obj);}

    public static String getInput(String s) {
        if  (in == null) {
            in = new Scanner(System.in);
        }
        out(s);
        return in.nextLine();
    }
}
