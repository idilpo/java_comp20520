import java.util.ArrayList;

public class Ship implements Vehicle {
    public String name;
    public int speed;
    public int passengers;
    public double disp;

    public Ship(String name, int speed, int passengers, double disp) {
        this.name = name;
        this.speed = speed;
        this.passengers = passengers;
        this.disp = disp;
        /*
        if (this.name == null || this.name == " " || this.speed <= 0 || this.passengers <= 0 || this.passengers >= 5000 || this.disp <= 0) {
            throw new IllegalArgumentException("failure");
        }
         */
    }

    public String getName() {return name;}
    public int getTopSpeed() {return speed;}
    public int getMaxPassengers() {return passengers;}
    public double getDisplacement() {return disp;}
    public static void printVehicles(ArrayList<Vehicle> v) {
        for (int i=0; i< v.size(); i++) {
            if (v.get(i) instanceof Ship) {
                double casted_disp = ((Ship)v.get(i)).getDisplacement();
                System.out.println("This ship displaces " + casted_disp + " tonnes of water");
            }
            if (v.get(i) instanceof Car) {
                //newType newVar = (newType)oldVar;
                double casted_weight = ((Car)v.get(i)).getWeight();
                System.out.println("This car weighs " + casted_weight + " tonnes");
            }
        }
    }

    public static void main(String[] args) {
        /*tests for q3:
        try {
            Vehicle v = new Ship("Simons", 6, 10, 14.15);
            Ship s = new Ship("Simons", 6, 10, 14.15);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(s.getMaxPassengers());
            System.out.println(s.getDisplacement());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Ship("Simons", 6, 10, 14.15);
            Ship s = new Ship("Simons", -1, 10, 14.15);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(s.getMaxPassengers());
            System.out.println(s.getDisplacement());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Ship("Simons", 6, 10000, 14.15);
            Ship s = new Ship("Simons", 6, 10, 14.15);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(s.getMaxPassengers());
            System.out.println(s.getDisplacement());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Ship("Simons", 5, 10, 14.15);
            Ship s = new Ship("Simons", -124, 10, 14.15);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(s.getMaxPassengers());
            System.out.println(s.getDisplacement());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Ship("Simons", 5, 10, 14.15);
            Ship s = new Ship("Simons", 5, 10, -14.15);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(s.getMaxPassengers());
            System.out.println(s.getDisplacement());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Ship("Simons", 5, 10, 14.15);
            Ship s = new Ship(" ", 5, 10, 14.15);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(s.getMaxPassengers());
            System.out.println(s.getDisplacement());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Ship("RMS Titanic", 24, 2224, 52310);
            Ship s = new Ship("RMS Titanic", 24, 2224, 52310);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(s.getMaxPassengers());
            System.out.println(s.getDisplacement());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }
         */

        /* tests for q6:
        ArrayList<Vehicle> vehicles3 = new ArrayList<Vehicle>();
        vehicles3.add(new Car("Mazda 3", 190,5,1.3));
        vehicles3.add(new Car("Lamborghini Gallardo", 325,2,1.45));
        vehicles3.add(new Ship("Titanic", 39,3327, 52310));
        vehicles3.add(new Car("Toyota Avensis", 200,5,2.02));
        vehicles3.add(new Ship("Nimitz", 58,5680, 100020));
        printVehicles(vehicles3);

        ArrayList<Vehicle> vehicles4 = new ArrayList<Vehicle>();
        vehicles4.add(new Car("Lamborghini Gallardo", 325,2,1.45));
        vehicles4.add(new Ship("Titanic", 39,3327, 52310));
        vehicles4.add(new Car("Mazda 3", 190,5,1.3));
        vehicles4.add(new Car("Toyota Avensis", 200,5,2.02));
        vehicles4.add(new Ship("Nimitz", 58,5680, 100020));
        printVehicles(vehicles4)
         */
    }
}
