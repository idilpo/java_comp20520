
public interface Building {
    // interfaces only have an "abstract class" that is used to group related methods with empty bodies:
    public void addRoom(double area, int room_floor);
    public int getNumWindows();
    public double getFloorSpace(int given_floor);
    public double getTotalFloorSpace();
    // (these methods will be implemented in classes House, Bungalow and Estate)
}