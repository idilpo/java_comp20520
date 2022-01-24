import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {

    public static void averageIntegers(String str) throws IOException {

        Scanner in = new Scanner(new File(str));
        int count = 0;
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(in.hasNextInt()){
            int n = in.nextInt();
            if (n > max) {max = n;}
            if (n < min) {min = n;}

            count++;
            total += n;
        }

        float avg = (float) total / count;
        System.out.println("Min Value: " + min);
        System.out.println("Max Value: " + max);
        System.out.println("Average Value: " + avg);
        in.close();

    }
}
