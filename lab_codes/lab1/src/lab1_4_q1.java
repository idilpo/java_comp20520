import javax.swing.JOptionPane;
public class lab1_4_q1 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Input the first integer: ");
        String b = JOptionPane.showInputDialog("Input the second integer: ");
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        addition(A, B);
        subtract(A, B);
        multiply(A, B);
        division(A, B);
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
}
