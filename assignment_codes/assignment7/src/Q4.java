import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String name = "", employer = "";
            int age = -1, salary = -1;

            while (!in.hasNext("[A-z]+")) { //name
                System.out.println("received int expecting String");
                int num = in.nextInt();
            }
            name = in.next();

            while (!in.hasNextInt()) { //age
                System.out.println("received String expecting int");
                String str = in.next();
            }
            age = in.nextInt();

            while (!in.hasNext("[A-z]+")) { //employer
                System.out.println("received int expecting String");
                int num = in.nextInt();
            }
            employer = in.next();

            while (!in.hasNextInt()) { //salary
                System.out.println("received String expecting int");
                String str = in.next();
            }
            salary = in.nextInt();

            Employee Em = new Employee(name, age, employer, salary);
            System.out.println(Em);
        }
    }
}