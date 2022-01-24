
public class MultiplyerCalculatable implements Calculator {

    public Calculatable calculate(Calculatable[] calculatables) {
        if (calculatables.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int total = calculatables[0].getValue();
        if (calculatables.length > 1) {
            for (int i=1; i<calculatables.length; i++) {
                total *= calculatables[i].getValue();
            }
        }

        return new SimpleCalculatable(total);
    }

}
