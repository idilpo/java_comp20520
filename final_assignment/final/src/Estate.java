
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Estate {

    private ArrayList <Building> buildings; // an arraylist of buildings in the estate
    private double gardenSizePolicy;
    private int maxEstateArea; // represents maximum permitted estate ara

    double total_estate_area = 0;

    public Estate(ArrayList<Building> b, double gardenSizePolicy, int maxEstateArea) {

        // validity checks:
        if (b == null) { // the arraylist cannot be empty
            this.buildings = new ArrayList<Building>();
        }
        if (gardenSizePolicy < 0.5 || gardenSizePolicy > 3) {
            throw new IllegalArgumentException("The garden size policy needs to be between 0.5 and 3 (inclusively).");
        }
        if (maxEstateArea < 0) {
            throw new IllegalArgumentException("Max Estate Area cannot be negative.");
        }

        this.buildings = buildings;
        this.gardenSizePolicy = gardenSizePolicy;
        this.maxEstateArea = maxEstateArea;

    }

    // getters and setters:
    public ArrayList<Building> getBuildings() {return buildings;}
    public void setBuildings(ArrayList<Building> buildings) {this.buildings = buildings;}
    public double getGardenSizePolicy() {return gardenSizePolicy;}
    public void setGardenSizePolicy(double gardenSizePolicy) {this.gardenSizePolicy = gardenSizePolicy;}
    public int getMaxEstateArea() {return maxEstateArea;}
    public void setMaxEstateArea(int maxEstateArea) {this.maxEstateArea = maxEstateArea;}

    // class methods:
    public void addBuilding(Building b) {
        double available_area = maxEstateArea - total_estate_area;
        double area_of_b = 0;
        if (b instanceof Bungalow) {area_of_b = ((Bungalow) b).area_of_bungalow;}
        else if (b instanceof House) {area_of_b = b.getTotalFloorSpace();}

        if (available_area >= area_of_b ) { // ensures maxEstateArea isn't exceeded
            buildings.add(b);
        } else {
            throw new IllegalArgumentException("The estate doesn't have enough area to add" + b.getClass());
        }
    }

    public double calculateArea() {
        double total_house_area = 0;
        double total_bungalow_area = 0;
        double max_floor = 0; // maximum area of the largest floor
        for (Building b: buildings) {
            if (b instanceof Bungalow) {
                total_bungalow_area = ((Bungalow) b).area_of_bungalow + ((gardenSizePolicy / 2) * ((Bungalow) b).area_of_bungalow);
                System.out.println(((Bungalow) b).area_of_bungalow);
            } else if (b instanceof House) { // user didn't enter right
                max_floor = b.getFloorSpace(0); // set to the first array in the arraylist
                for (int i=0; i<((House) b).getHas_floors(); i++) {
                    if (b.getFloorSpace(i) > max_floor) {
                        max_floor = b.getFloorSpace(i);
                    }
                    total_house_area = max_floor + (gardenSizePolicy * max_floor);
                }
            } else {
                throw new IllegalArgumentException("Please enter a valid instance!");
            }
        }
        total_estate_area = total_house_area + total_bungalow_area;
        return total_estate_area;
    }

    public int getNumWindows() {
        int estate_windows = 0; // variable that keeps track of the windows in the estate is created
        for (int i=0; i<buildings.size(); i++) { // looping through the arraylist and adding all window numbers for each building
            if (buildings.get(i) instanceof House) {
                estate_windows += ((House) buildings.get(i)).getNumWindows();
            } else if (buildings.get(i) instanceof Bungalow) {
                estate_windows += ((Bungalow) buildings.get(i)).num_of_windows_bungalow;
            }
             // the method "getNumWindows" is inherited from the parent class "House"
        }
        return estate_windows;
    }

    public static void main(String[] args) {
        Estate e = new Estate(null, 2, 160);

        Building house = new House(2);
        house.addRoom(10, 0);
        house.addRoom(15, 0);
        house.addRoom(20, 1);

        Building bungalow = new Bungalow();
        bungalow.addRoom(10, 0);
        bungalow.addRoom(30, 0);

        e.addBuilding(house);
        //largest room is 25, so area is 25 + (25 * 2) = 75
        assertEquals(75, e.calculateArea());

        e.addBuilding(bungalow);
        System.out.println(e.buildings);
        //bungalow is 40 + (40 * (2 / 2)) = 40 + 40 = 80
        //75 (house) + 80 (bungalow) = 155
        assertEquals(155, e.calculateArea());


    }
}


