import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[3];

        float result = Float.parseFloat(in.next());

        while (in.hasNext()) {

            arr[0] = String.valueOf(result);
            arr[1] = in.next();
            arr[2] = in.next();

            switch (arr[1]) {
                case "+" :
                    result = Float.parseFloat(arr[0]) + Float.parseFloat(arr[2]);
                    System.out.println(result);
                    break;
                case "-" :
                    result = Float.parseFloat(arr[0]) - Float.parseFloat(arr[2]);
                    System.out.println(result);
                    break;
                case "x" :
                    result = Float.parseFloat(arr[0]) * Float.parseFloat(arr[2]);
                    System.out.println(result);
                    break;
                case "/" :
                    result = Float.parseFloat(arr[0]) / Float.parseFloat(arr[2]);
                    System.out.println(result);
                    break;
                default :
                    System.out.println("unknown operator");
                    return;
            }
        }
    }
}
