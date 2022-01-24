import java.util.ArrayList;

public class House implements Building {

    private int has_floors; // represents how many floors a house has
    private ArrayList<Double> floor_areas = new ArrayList<Double>(); // arraylist that stores all the floor area in a given house
    // counts are initialised as 0 in the beginning:
    private int windows = 0;
    int total_room_count = 0;
    double total_building_area  = 0;

    // constructor:
    public House(int has_floors) {
        if (has_floors < 0) { // checking if the house has valid (positive) number of floors
            throw new IllegalArgumentException("House cannot have less than a floor.");
        }
        this.has_floors = has_floors;

        for (int i=0; i<has_floors; i++) {floor_areas.add((double) 0);} // all individual floor areas are set to 0  in the beginning
        windows += (has_floors) * 2; // for each floor, the house gets 2 more windows
    }

    // getters:
    public int getHas_floors() {return has_floors;}
    public void setHas_floors(int has_floors) {this.has_floors = has_floors;}
    public int getWindows() {return windows;}
    public void setWindows(int windows) {this.windows = windows;}
    public ArrayList<Double> getFloor_areas() {return floor_areas;}
    // setters:
    public void setFloor_areas(ArrayList<Double> floor_areas) {this.floor_areas = floor_areas;}
    public int getTotal_room_count() {return total_room_count;}
    public void setTotal_room_count(int total_room_count) {this.total_room_count = total_room_count;}
    public double getTotal_building_area() {return total_building_area;}
    public void setTotal_building_area(double total_building_area) {this.total_building_area = total_building_area;}

    @Override
    public String toString() {
        return "House: " + windows + " windows, " + total_room_count + " Rooms, Floor Space: " + total_building_area + ", and " + has_floors + " Floors";
    }

    @Override
    public void addRoom(double area, int room_floor) { // this method is used to add a room to a given floor with the given area
        if (area < 0 || room_floor < 0) { // checking if the entered area and floor values are valid or not
            throw new IllegalArgumentException("Inputs cannot be negative. Please enter valid inputs.");
        }
        double total_floor_area = floor_areas.get(room_floor); // get the value of area in that certain floor
        floor_areas.set(room_floor, area + total_floor_area); // add the new room to the total are of the floor
        windows += 1; // with each room, the number of windows is incremented by 1
        total_room_count += 1; // newly added room increments the total room count by 1
        if (has_floors > 3) {windows += 1;} // when there are more than 3 floors in a house, the total incrementation of windows should be 2
    }

    @Override
    public int getNumWindows() {return windows;} // this method will return the number of windows in a building

    @Override
    public double getFloorSpace(int given_floor) { // this method will return the floor space for a given floor in the building
        if (given_floor < 0) { // checking if the floor value is valid or not
            throw new IllegalArgumentException("Inputs cannot be negative. Please enter valid inputs.");
        }
        return floor_areas.get(given_floor);
    }

    @Override
    public double getTotalFloorSpace() { // this method will calculate the total floor area of the building
        for (int i=0; i<floor_areas.size(); i++) { // looping through the arraylist
            total_building_area += floor_areas.get(i); // adding all areas together
        }
        return total_building_area;
    }

    public static void main(String[] args) {
        //House h = new House(2);

    }
}
