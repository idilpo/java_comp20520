import java.util.Scanner;

public class lab1_3_q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.printf("Hello %s!", name);
    }
}
