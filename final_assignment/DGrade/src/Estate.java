
import java.util.ArrayList;

public class Estate {

    private ArrayList <Building> buildings; // an arraylist of buildings in the estate
    private double gardenSizePolicy;
    private int maxEstateArea; // represents maximum permitted estate ara

    double total_estate_area = 0;

    public Estate(ArrayList<Building> b, double gardenSizePolicy, int maxEstateArea) {
        this.buildings = buildings;
        this.gardenSizePolicy = gardenSizePolicy;
        this.maxEstateArea = maxEstateArea;

    }

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
            } else if (b instanceof House) {
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
        }
        return estate_windows;
    }

}


