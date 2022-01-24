public class Lab2Floor2_3 {

    public Lab2Floor2_3() {} //default constructor

    public static void main(String[] args) {
        Lab2Floor2_3 l = new Lab2Floor2_3();
        //l.draw(5, 3); // test for step 2
        l.draw(5, 5); // test for step 3
    }

    public void draw(int x, int y) {
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.printf("o ");
                    }
                    else {
                        System.out.printf("x ");
                    }
                }
                else {
                    if (j % 2 == 0) {
                        System.out.printf("o ");
                    }
                    else {
                        System.out.printf("x ");
                    }
                }
            }
            System.out.println(" ");
        }
    }

}