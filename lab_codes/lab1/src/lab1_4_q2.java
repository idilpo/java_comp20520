import javax.swing.JOptionPane;
public class lab1_4_q2 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Input your first string: ");
        String b = JOptionPane.showInputDialog("Input your second string: ");
        System.out.println(myMethod(a));
        System.out.println(myMethod(b));
    }

    public static String myMethod(String s)
    {
        return s.toUpperCase();
    }
}
