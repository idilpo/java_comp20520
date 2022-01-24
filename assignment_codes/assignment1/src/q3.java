public class q3 {
    public static void main(String[] args) {
        for (int i=2; i<=1000; i++) {
            int num = 0;
            for (int j=1; j<=i; j++)
            {
                if(i % j == 0) {num++;}
            }
            if (num == 2) {System.out.print(i + " ");}
        }
    }
}


