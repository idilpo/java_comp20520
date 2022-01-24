
public class Bungalow extends House {

    public double area_of_bungalow ;
    public int num_of_windows_bungalow ;

    public Bungalow() {
        super(0);// gets "has _floors" from its parent class using super
        area_of_bungalow = super.total_building_area;
        num_of_windows_bungalow = super.getWindows();
    }

    @Override
    public String toString() {
        return "Bungalow: " + super.getWindows() + " windows, " + super.total_room_count + " Rooms, Floor Space: " + area_of_bungalow + ", and 1 Floor";
    }

    @Override
    public void addRoom(double area, int floor) {
        if (super.getTotalFloorSpace() + area < 60) {

            super.addRoom(area, floor);
        }
    }

    public static void main(String[] args) {
        Building b1 = new Bungalow();
    }
}


