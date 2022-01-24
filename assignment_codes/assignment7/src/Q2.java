import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i=0; i<arr.length; i++) {arr[i] = in.next();}



        int result = 0;
        float result_too;
        switch (arr[1]) {
            case "+" :
                result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                System.out.println(result);
                break;
            case "-" :
                result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                System.out.println(result);
                break;
            case "x" :
                result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                System.out.println(result);
                break;
            case "/" :
                result_too = Float.parseFloat(arr[0]) / Float.parseFloat(arr[2]);
                System.out.println(result_too);
                break;
            default :
                System.out.println("unknown operator");
        }
    }
}


