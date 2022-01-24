
public class Bungalow extends House {

    public double area_of_bungalow = 0; // area is initialised as 0 in the beginning
    public int num_of_bungalow_windows = 2; // since bungalow only has one floor, by default it has 2 windows at start

    public Bungalow() {
        super(0); // inherits "has _floors" from its parent class using super
    }

    @Override
    public String toString() {
        return "Bungalow: " + num_of_bungalow_windows + " windows, " + super.total_room_count + " Rooms, Floor Space: " + area_of_bungalow + ", and 1 Floor";
    }


    @Override
    public void addRoom(double area, int room_floor) { // this method is used to add a room with the given area
        if (area < 0 || room_floor < 0) { // checking if the area and floor values are valid or not
            throw new IllegalArgumentException("Inputs cannot be negative. Please enter valid inputs.");
        }

        if (area_of_bungalow + area < 60) { // add room if bungalow's current area and the area that will be added is not exceeding 60
            area_of_bungalow += area; // new room's area is added to the total
            total_room_count += 1; // newly added room increments the total room count by 1
            num_of_bungalow_windows += 1; // new room's windows
        }

    }

    @Override
    public int getNumWindows() {return num_of_bungalow_windows;} // this method will return the number of windows in a building

    @Override
    public double getTotalFloorSpace() {return area_of_bungalow;} // this method will return the total floor area of the building

    @Override
    public double getFloorSpace(int given_floor) {
        if (given_floor < 0) { // checking if the floor value is valid
            throw new IllegalArgumentException("Inputs cannot be negative. Please enter valid inputs.");
        }
        return area_of_bungalow; // since bungalow only has one floor, this is sufficient
    }

}

