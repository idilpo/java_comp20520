
import java.util.ArrayList;

public class Estate {

    private ArrayList <Building> buildings; // an arraylist of buildings in the estate
    private double gardenSizePolicy;
    private int maxEstateArea; // represents maximum permitted estate area
    double total_estate_area = 0; // area is initialised as 0 in the beginning

    public Estate(ArrayList<Building> b, double gardenSizePolicy, int maxEstateArea) {

        // validity checks:
        if (b == null) { // the arraylist cannot be empty
            this.buildings = new ArrayList<Building>();
        }
        if (gardenSizePolicy < 0.5 || gardenSizePolicy > 3) { // restrictions for gardenSizePolicy
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


    public double calculateArea() { // this method will calculate the total estate area
        // house and bungalow areas are set to 0 individually:
        double total_house_area = 0;
        double total_bungalow_area = 0;
        double largest_floor = 0; // maximum area of the largest floor
        for (Building b: buildings) {
            if (b instanceof Bungalow) { // if this building is a bungalow
                total_bungalow_area = ((Bungalow) b).area_of_bungalow + ((gardenSizePolicy / 2) * ((Bungalow) b).area_of_bungalow);
            } else if (b instanceof House) { // if this building is a house
                largest_floor = b.getFloorSpace(0); // largest floor is set to the first array in the arraylist
                for (int i=0; i<((House) b).getHas_floors(); i++) { // looping through the array
                    if (b.getFloorSpace(i) > largest_floor) { // checking if other elements are larger than the current element
                        largest_floor = b.getFloorSpace(i); // if they are, change the largest floor
                    }
                    total_house_area = largest_floor + (gardenSizePolicy * largest_floor);
                }
            } else { // if something else is entered incorrectly that is neither bungalow nor house
                throw new IllegalArgumentException("Please enter a valid instance!");
            }
        }
        total_estate_area = total_house_area + total_bungalow_area;
        return total_estate_area;
    }



    public void addBuilding(Building b) { // this method will check if the entered building is valid to be added to the list of buildings
        double available_area = maxEstateArea - total_estate_area; // available area to add buildings to
        double area_of_b = 0; // given building's area is set to 0 in the beginning
        // areas are updated according to the building:
        if (b instanceof Bungalow) {area_of_b = ((Bungalow) b).area_of_bungalow;}
        else if (b instanceof House) {area_of_b = b.getTotalFloorSpace();}

        if (available_area >= area_of_b) { // ensures maxEstateArea isn't exceeded
            buildings.add(b); // building is added to the arraylist of buildings
        } else { // in case maxEstateArea is exceeded
            throw new IllegalArgumentException("The estate doesn't have enough area to add " + b.getClass());
        }
    }



    public int getNumWindows() { // this method will calculate the number of windows in a building
        int estate_windows = 0; // variable that keeps track of the windows in the estate is initialised to 0
        for (int i=0; i<buildings.size(); i++) { // looping through the arraylist and adding all window numbers for each building:
            if (buildings.get(i) instanceof House) {
                estate_windows += ((House) buildings.get(i)).getNumWindows();
            } else if (buildings.get(i) instanceof Bungalow) {
                estate_windows += ((Bungalow) buildings.get(i)).num_of_bungalow_windows;
            }
        }
        return estate_windows;
    }

    public static void main(String[] args) {

    }
}


