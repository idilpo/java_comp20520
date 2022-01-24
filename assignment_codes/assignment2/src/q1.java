import java.awt.*;

public class q1 {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,5,67,7);
        Point p1 = new Point(1,1);
        Point p2 = new Point(7,7);

        Rectangle box2 = new Rectangle(5,5,67,7);
        Point p3 = new Point(7,7);
        Point p4 = new Point(1,1);

        Rectangle box3 = new Rectangle(1,1,3,3);
        Point p5 = new Point(7,7);
        Point p6 = new Point(2,2);

        Rectangle box4 = new Rectangle(10,10,3,3);
        Point p7 = new Point(7,7);
        Point p8 = new Point(2,2);


    }

    public void method() {
        if (box.contains(p1)) {
            System.out.println("The point p1 is inside the box");
        } else {System.out.println("The point p1 is outside the box");}

        if (box.contains(p2)) {
            System.out.println("The point p2 is inside the box");
        } else {System.out.println("The point p2 is outside the box");}
    }
}
