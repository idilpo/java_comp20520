import javax.swing.JOptionPane;
public class lab1_3_q2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input user name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        //JOptionPane.showMessageDialog(null, "Hello %s!", name, JOptionPane.QUESTION_MESSAGE);
    }
}
