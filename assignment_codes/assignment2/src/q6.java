
public class q6 {
    public static void main(String[] args) {
        integerFun(1, 1);
        integerFun(2, 3);
        integerFun(12, 3);
        integerFun(6, 4);
        integerFun(7, 6);

    }

    public static void integerFun(int a, int b) {
        System.out.println("Sum: " + (a+b));
        System.out.println("Product: " + (a*b));
        System.out.println("Concatenation: " + a + b);
        System.out.println("Power: " + Math.pow(a,b));
    }
}
