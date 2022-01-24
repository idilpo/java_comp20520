/*
import java.util.ArrayList;

public class House implements Building {

    // variables are declared:
    private int has_floors; // represents how many floors a house has
    private int windows = 0;
    private ArrayList <Double> floor_areas = new ArrayList<Double>(); // a particular room's info: room[floor][area]
    private int total_rooms = 0;
    private double floor_space = 0;
    private double total_floor_space = 0;

    // constructor:
    public House(int has_floors) {

        if (has_floors < 1) {
            throw new IllegalArgumentException("House cannot have less than a floor.");
        }

        this.has_floors = has_floors;
        windows = (has_floors * 2) + (total_rooms * 3);

    }

    // getters:
    public int getHas_floors() {return has_floors;}
    public int getWindows() {return windows;}
    public double[][] getRoom() {return room;}
    public int getTotal_rooms() {return total_rooms;}
    public double getFloor_space() {return floor_space;}
    // setters:
    public void setHas_floors(int has_floors) {this.has_floors = has_floors;}
    public void setWindows(int windows) {this.windows = windows;}
    public void setRoom(double[][] room) {this.room = room;}
    public void setTotal_rooms(int total_rooms) {this.total_rooms = total_rooms;}
    public void setFloor_space(double floor_space) {this.floor_space = floor_space;}


    @Override
    public String toString() {
        return "House: " + windows + " Windows, " + total_rooms + "  Rooms, Floor Space: " + floor_space + "and " + has_floors + " Floors";
    }

    @Override
    public void addRoom(double area, int floor) {
        if (area < 0 || floor < 0) {
            throw new IllegalArgumentException("Inputs cannot be negative. Please enter valid inputs.");
        }
        floor_areas
        windows += 2;
    }

    @Override
    public int getNumWindows() {return windows;}

    @Override
    public double getFloorSpace(int floor) {
        if (floor < 0) {
            throw new IllegalArgumentException("Inputs cannot be negative. Please enter valid inputs.");
        }
        for (int i=0; i<100; i++) {floor_space += room[floor][i];}
        return floor_space;
    }

    //will worry about later
    @Override
    public double getTotalFloorSpace() {
        double fs = 0;
        for (int j=0; j<100; j++) {
            for (int i=0; i<100; i++) {
                fs+= floor_space;
            }
            total_floor_space += fs;
        }
        System.out.println(total_floor_space);
        return total_floor_space;
    }


    public static void main(String[] args) {
        House h = new House(2);
        

    }

}

 */


