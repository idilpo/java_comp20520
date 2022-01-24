import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab1_complete {
    public static void main(String[] args) {
        System.out.println("heya! this is lab1q1");
        System.out.println("heya! this is lab1q2");
        System.out.println("heya! this is lab1q2");

        int n = 3;
        for (int i=0; i<n; i++) {
            System.out.println("heya! this is lab1q3");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.printf("Hello %s!", name);

        String name1 = JOptionPane.showInputDialog("Input user name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name1);
        //JOptionPane.showMessageDialog(null, "Hello %s!", name, JOptionPane.QUESTION_MESSAGE);

        String a = JOptionPane.showInputDialog("Input the first integer: ");
        String b = JOptionPane.showInputDialog("Input the second integer: ");
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        addition(A, B);
        subtract(A, B);
        multiply(A, B);
        division(A, B);

        String a = JOptionPane.showInputDialog("Input your first string: ");
        String b = JOptionPane.showInputDialog("Input your second string: ");
        System.out.println(myMethod(a));
        System.out.println(myMethod(b));

        String a1 = JOptionPane.showInputDialog("Input two integer values: ");
        String b1 = JOptionPane.showInputDialog("Input two integer values: ");
        int A1 = Integer.parseInt(a1);
        int B1 = Integer.parseInt(b1);
        int sum1 = A1 + B1;
        System.out.println(sum1);
    }

    public static int addition(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
        return sum;
    }

    public static int subtract(int x, int y) {
        int output = x - y;
        System.out.println(output);
        return output;
    }

    public static int multiply(int x, int y) {
        int total = x * y;
        System.out.println(total);
        return total;
    }

    public static double division(int x, int y) {
        double div = (double)x / (double)y;
        System.out.println(div);
        return div;
    }

    public static String myMethod(String s)
    {
        return s.toUpperCase();
    }
}
