public class q4 {
    public static void main(String[] args) {
       for (int n=1; n<=500; n++) {
           if (n%3 == 0) {
               System.out.printf(n + " ");
               if (n%5 == 0) {
                   continue;
               }
           }
           if (n%5 == 0) {
               System.out.printf(n + " ");
           }
       }
    }
}

