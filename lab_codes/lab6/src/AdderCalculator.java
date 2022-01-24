
public class AdderCalculator implements Calculator {

    public Calculatable calculate(Calculatable[] calculatables) {
        if (calculatables.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int sum = 0;
        for (Calculatable c: calculatables) {
            sum += c.getValue();
        }
        return new SimpleCalculatable(sum);
    }

    public static void main(String[] args) {
        Calculatable[] c = new Calculatable[3];
        c[0] = new SimpleCalculatable(2);
        c[1] = new SimpleCalculatable(3);
        c[2] = new SimpleCalculatable(4);

        AdderCalculator a = new AdderCalculator(); //default constructor: takes no input, this calls the constructor in obj
        System.out.println(a.calculate(c).getValue());

        MultiplyerCalculatable m = new MultiplyerCalculatable(); //default constructor: takes no input, this calls the constructor in obj
        System.out.println(m.calculate(c).getValue());
        /*
        Calculator a2 = new Calculator.generateCalculator();
        Calculator m2 = new Calculator.generateCalculator();
         */
    }
}
