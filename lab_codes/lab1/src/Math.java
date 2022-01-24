import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String a = in.nextLine();
        System.out.println("Enter second number: ");
        String b = in.nextLine();

        /*
         * This is for error handling.
         * Try essentially means, the following code may throw an error (Exception)
         * catch: means if an error (Exception) of a specific type, in this case a
         * NumberFormatException, is thrown execute the following block of code,
         * which in this case, is to print an error message (see Video).
         */
        try {
            int i = Integer.parseInt(a);
            int j = Integer.parseInt(b);

            System.out.println(add(i, j));
            System.out.println(subtract(i, j));
            System.out.println(multiply(i, j));
            System.out.println(divide(i, j));
        } catch (NumberFormatException ex) {
            System.err.println("You did not enter a number");
        }

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    /*
     * now we need to be careful with divide as integer division results in truncation
     * therefore, we need to use a larger primitive: a float or double
     * and to use them, we cast (convert type) our ints to doubles
     * Note that the return type is also a double
     */
    public static double divide (int a, int b) {

        System.out.println("THis is the result if we don't cast the ints: " + (a / b));

        return (double)a / (double)b;
    }
}
