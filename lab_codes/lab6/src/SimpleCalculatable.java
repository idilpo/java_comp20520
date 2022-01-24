
public class SimpleCalculatable implements Calculatable {

    private int value;

    public SimpleCalculatable(int value) {
        this.value = value;
    }

    public int getValue() {return value;}
    public void negate() {value *= -1;}


}
