import java.util.ArrayList;

public class Metal {

    public static enum type {GOLD, LEAD, TIN};
    private type t;
    private double mass;
    private double purity;
    private ArrayList<String> history;

    //values for enum that doesnt change:
    public static final double GOLD = 48.75;
    public static final double LEAD = 0.01;
    public static final double TIN = 0.03;

    //getters:
    public double getMass() {return mass;}
    public double getPurity() {return purity;}
    public type getType() {return t;}
    public ArrayList<String> getHistory() {return history;}
    //mutator methods arent added since the only time we are changing the variables is at q6


    public Metal (double mass, type t) {
        if (mass < 1) {
            throw new IllegalArgumentException("Mass must be positive.");
        }

        this.mass = mass;
        this.t = t;

        purity = 1; //need to initialise bc by default this is set to 0
        history = new ArrayList<String>();
    }

    public static void main(String[] args) {
        Metal m1 = new Metal(100, type.GOLD);
        Metal m2 = new Metal(50, type.LEAD);
        Metal m3 = new Metal(25, type.TIN);

        System.out.println(m2);
        m2.mixWith(m3);
        System.out.println(m2);

        System.out.println(m1);
        m1.mixWith(m2);
        System.out.println(m1);

        m3.mixWith(m3);
        System.out.println(m3);

        for (String s: m1.getHistory()) {
            System.out.println(s);
        }
    }

    //an accessor method:
    public double getValue() {
        switch(t) {
            case GOLD: return mass * purity * GOLD;
            case LEAD: return mass * purity * LEAD;
            case TIN: return mass * purity * TIN;
            default: throw new RuntimeException("Type" + t + "haven't been considered.");
        }
    }

    public String toString() {
        String middle;
        switch(t) {
            case GOLD: middle = "Gold, "; break;
            case LEAD: middle = "Lead, "; break;
            case TIN: middle = "Tin, "; break;
            default: middle = "Unknown, "; break;
        }
        return "Metal: " + middle + "Mass: " + mass + ", Value: " + getValue();
    }

    public void mixWith (Metal m) { //will not be mutating the passed in variable, will only be mutating the current instance var

        history.add("Mixed with: " + m);

        if (t.equals(m.getType())) {mass += m.getMass();}
        else if (t.equals(type.TIN) && m.getType().equals(type.LEAD) || t.equals(type.LEAD) && m.getType().equals(type.TIN)) {
            t = type.GOLD;
            mass += m.getMass();
            return;
        } else if (t.equals(type.GOLD) && (m.getType().equals(type.LEAD) || m.getType().equals(type.TIN))) {
            double gold_currently = mass;
            mass += m.getMass();
            purity = gold_currently / mass;
            if (purity < 0.5) {t = m.getType();}
        } else if ((t.equals(type.LEAD) || t.equals(type.TIN)) && m.getType().equals(type.GOLD)) {
            mass += m.getMass();
            purity = m.getMass() / mass;
            if (purity >= 0.5) {
                t = type.GOLD;
            } else {purity = 1-purity;}
        }

    }
}
