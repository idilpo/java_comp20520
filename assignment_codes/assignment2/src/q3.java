
public class q3 {
    public static void main(String[] args) {
        printString("Hello");
        printString("This is a longer String");
        printString("This\nis\na\nString\non\ndifferent\nlines");
    }


    public static void printString(String s) {
        System.out.println(s);
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            count +=  1;
        }
        System.out.println("Contains " + count + " characters");
    }
}
