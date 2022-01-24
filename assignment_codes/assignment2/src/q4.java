
public class q4 {
    public static void main(String[] args) {
        System.out.println(reverseChangeCase("1234"));
        System.out.println(reverseChangeCase("assignment 2 likes strings"));
        System.out.println(reverseChangeCase("a string with numbers 1234"));

    }

    public static String reverseChangeCase(String s) {
        char arr[] = s.toCharArray();
        String rev="";
        for (int i=arr.length-1; i>=0; i--) {
            rev += arr[i];
        }
        return rev.toUpperCase();
    }
}

