public class Lab2Floor5 {
    public enum tile {x, o, bar, minus, plus};

    public static void main(String[] args) {
        Lab2Floor5 l = new Lab2Floor5();
        l.draw(13,10);
    }

    public void draw(int x, int y) {
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (i % 3 == 0 && j % 3 == 0) {
                    printTile(tile.plus);
                }
                else if (i % 3 == 0) {
                    printTile(tile.minus);
                }
                else if (j % 3 == 0) {
                    printTile(tile.bar);
                }
                else {
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
