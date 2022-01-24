import javax.swing.JOptionPane;
public class lab1_4_q3 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Input two integer values: ");
        String b = JOptionPane.showInputDialog("Input two integer values: ");
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int sum = A + B;
        System.out.println(sum);
    }
}
