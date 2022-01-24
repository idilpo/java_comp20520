
public class q7 {
    public static void main(String[] args) {
        printTriangle(3, 'x');
        printTriangle(12, 'o');
        printTriangle(5, '*');

    }

    public static void printTriangle(int n, char c) {
        if (n>=2 && n<=10)
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
         } else {
            System.out.println("Not valid input");
        }

    }
}
