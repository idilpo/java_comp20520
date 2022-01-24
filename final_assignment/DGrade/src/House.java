import java.util.ArrayList;

public class House implements Building {

    private int has_floors; // represents how many floors a house has
    private ArrayList<Double> floor_areas = new ArrayList<Double>(); // arraylist that stores all the floor area in a given house
    private int windows = 0;
    int total_room_count = 0;
    double total_building_area  = 0;

    // constructor:
    public House(int has_floors) {
        this.has_floors = has_floors;
        // all floor areas are set to 0  in the beginning:
        for (int i=0; i<has_floors; i++) {floor_areas.add((double) 0);}
        windows += has_floors * 2;
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
    public void addRoom(double area, int floor) {
        double total_floor_area = floor_areas.get(floor); // gets the value of area in that certain floor
        floor_areas.set(floor, area + total_floor_area); // adds the new room to the total are of the floor
        windows += 1;
        total_room_count += 1;
        if (has_floors > 3) {windows += 1;}
    }

    @Override
    public int getNumWindows() {return windows;}

    @Override
    public double getFloorSpace(int floor) {return floor_areas.get(floor);}

    @Override
    public double getTotalFloorSpace() {
        for (int i=0; i<floor_areas.size(); i++) {
            total_building_area += floor_areas.get(i);
        }
        return total_building_area;
    }

    public static void main(String[] args) {
        //House h = new House(2);

    }

}