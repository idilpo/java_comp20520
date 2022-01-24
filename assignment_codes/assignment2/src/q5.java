
public class q5 {

    public static void main(String[] args) {
        printString("Hello");
        printString("This is my longer String");
        printString("my my my");
        printString("My answer is correct");
    }
    public static void printString(String s) {
        System.out.println(s);
        System.out.println(s.replace("my", "your"));
    }

}
