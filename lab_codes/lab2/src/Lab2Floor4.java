public class Lab2Floor4 {
    public static enum tile {x, o, bar, minus, plus};

    public Lab2Floor4() {} //default constructor

    public static void main(String[] args) {
        Lab2Floor2_3 l = new Lab2Floor2_3();
        printTile(tile.bar);
    }

    public void draw(int x, int y) {

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        printTile(tile.o);
                    }
                    else {
                        printTile(tile.x);
                    }
                }
                else {
                    if (j % 2 == 0) {
                        printTile(tile.o);
                    }
                    else {
                        printTile(tile.x);
                    }
                }
            }
            System.out.println(" ");
        }
    }

    private static void printTile(tile t) {
        switch (t) {
            case x:
                System.out.printf("x "); break;
            case o:
                System.out.printf("o "); break;
            case bar:
                System.out.printf("| "); break;
            case minus:
                System.out.printf("- "); break;
            case plus:
                System.out.printf("+ "); break;
        }
    }
}
