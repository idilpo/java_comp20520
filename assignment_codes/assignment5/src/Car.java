import java.util.ArrayList;

public class Car implements Vehicle {
    public String name;
    public int speed;
    public int passengers;
    public double weight;

    public Car(String name, int speed, int passengers, double weight) {
        this.name = name;
        this.speed = speed;
        this.passengers = passengers;
        this.weight = weight;
        /*
        if (this.name.length() == 0 || this.speed <= 0 || this.passengers <= 0 || this.weight < 0.5) {
            throw new IllegalArgumentException("failure");
        }
         */
    }

    public String getName() {return name;}
    public int getTopSpeed() {return speed;}
    public int getMaxPassengers() {return passengers;}
    public double getWeight() {return weight;}


    public static void main(String[] args) {
        /*tests for q2:
        try {
            Vehicle v = new Car("BMW", 280, 5, 2.1);
            Car c = new Car("BMW", 280, 5, 2.1);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(c.getMaxPassengers());
            System.out.println(c.getWeight());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Car("BMW", -280, 5, 2.1);
            Car c = new Car("BMW", 280, 5, 2.1);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(c.getMaxPassengers());
            System.out.println(c.getWeight());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Car("BMW", 280, 5, 2.1);
            Car c = new Car("BMW", 280, 0, 2.1);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(c.getMaxPassengers());
            System.out.println(c.getWeight());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Car("Smart", 150, 2, 0.75);
            Car c = new Car("Smart", 150, 2, 0.75);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(c.getMaxPassengers());
            System.out.println(c.getWeight());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Car("", 150, 2, 0.75);
            Car c = new Car("Smart", 150, 2, 0.75);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(c.getMaxPassengers());
            System.out.println(c.getWeight());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            Vehicle v = new Car("Smart", 150, 2, -0.75);
            Car c = new Car("Smart", 150, 2, 0.75);
            System.out.println(v.getName());
            System.out.println(v.getTopSpeed());
            System.out.println(c.getMaxPassengers());
            System.out.println(c.getWeight());
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }
         */


        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Ship("Titanic", 39, 3327, 52310);
        vehicles[1] = new Car("Toyota Avensis", 200, 5, 2.02);
        vehicles[2] = new Car("Lamborghini Gallardo", 325, 2, 1.485);
        vehicles[3] = new Ship("Nimitz", 58, 5680, 100020);
        vehicles[4] = new Car("Mazda 3", 190, 5, 1.3);

        /* tests for q4
        System.out.println(vehicles.length);
        for(int i = 0; i < vehicles.length; i++){
            System.out.println(vehicles[i].getName() + " - " + vehicles[i].getTopSpeed() + " - " + vehicles[i].getMaxPassengers());
        }
        System.out.println(((Ship)vehicles[0]).getDisplacement());
        System.out.println(((Car)vehicles[1]).getWeight());
        System.out.println(((Car)vehicles[2]).getWeight());
        System.out.println(((Ship)vehicles[3]).getDisplacement());
        System.out.println(((Car)vehicles[4]).getWeight());
     */

        /* tests for q5
        ArrayList<Vehicle> vehicles1 = new ArrayList<Vehicle>();
        vehicles1.add(new Car("Mazda 3", 190,5,1.3));
        vehicles1.add(new Car("Lamborghini Gallardo", 325,2,1.45));
        vehicles1.add(new Ship("Titanic", 39,3327, 52310));
        vehicles1.add(new Car("Toyota Avensis", 200,5,2.02));
        vehicles1.add(new Ship("Nimitz", 58,5680, 100020));
        System.out.println(Vehicle.fastestVehicle(vehicles1));

        ArrayList<Vehicle> vehicles2 = new ArrayList<Vehicle>();
        vehicles2.add(new Car("Mazda 3", 190,5,1.3));
        vehicles2.add(new Car("Lamborghini Gallardo", 325,2,1.45));
        vehicles2.add(new Ship("Titanic", 39,3327, 52310));
        vehicles2.add(new Car("Bugatti Veyron", 431, 2, 1.9));
        vehicles2.add(new Ship("Nimitz", 58, 5680, 100020));
        System.out.println(Vehicle.fastestVehicle(vehicles2));
         */
    }
}
