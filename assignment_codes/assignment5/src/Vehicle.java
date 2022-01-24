import java.util.ArrayList;

public interface Vehicle {

    public String getName();
    public int getTopSpeed();
    public int getMaxPassengers();
    public static String fastestVehicle(ArrayList<Vehicle> v) {
        int fast_v = v.get(0).getTopSpeed();
        String fast_name = "";
        for (int i=1; i< v.size(); i++) {
            if (v.get(i).getTopSpeed() > fast_v) {
                fast_v = v.get(i).getTopSpeed();
                fast_name = v.get(i).getName();
            }
        }
        return fast_name;
    }

}


