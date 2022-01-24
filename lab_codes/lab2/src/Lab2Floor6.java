import javax.swing.JOptionPane;
public class Lab2Floor6 {
    public enum tile {x, o, bar, minus, plus};

    public static void main(String[] args) {
        Lab2Floor6 l = new Lab2Floor6();
        String rows = JOptionPane.showInputDialog("Enter rows: ");
        String columns = JOptionPane.showInputDialog("Enter columns: ");
        String param = JOptionPane.showInputDialog("Enter a parameter: ");
        int int1 = Integer.parseInt(rows);
        int int2 = Integer.parseInt(columns);
        int int3 = Integer.parseInt(param);
        if (int3<2 || int3>5) {
            throw new IllegalArgumentException("Please enter a valid number!");
        }
        l.draw(int1, int2, int3);
    }

    public void draw(int x, int y, int z) {
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (i % z == 0 && j % z == 0) {
                    printTile(tile.plus);
                }
                else if (i % z == 0) {
                    printTile(tile.minus);
                }
                else if (j % z == 0) {
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
