
public class LambdaExample {

    public static void main(String[] args) {
        // declared an identifiier called "adder" of type "Calculator", takes an input of "calculatables"
        // after the lambda input (->), the body of the calculator is put
        // this is only possible if @FunctionalInterface is declared before
        Calculator adder = (calculatables) -> {
            //the body of the previously implemented adder func:
            if (calculatables.length == 0) {
                throw new IllegalArgumentException("Array is empty.");
            }

            int sum = 0;
            for (Calculatable c: calculatables) {
                sum += c.getValue();
            }
            return new SimpleCalculatable(sum);
        };
        // this allows to control the instance of the interface (Calculator),
        // it is useful since we dont have to make a class as well as other declarations


        // lambda expression always have the structure:
        // returned:  Calculator multiplier
        // given argument:  (calculatable)
        // if there are no arguments, it's left blank
        // lambda operator which specifies the commensement of the block of code:  ->
        // brackets where the method is specified:  {}
        Calculator multiplier = (calculatables) -> {
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
        };

        Calculatable[] c = new Calculatable[3];
        c[0] = new SimpleCalculatable(2);
        c[1] = new SimpleCalculatable(3);
        c[2] = new SimpleCalculatable(4);

        Calculatable cc = adder.calculate(c);
        System.out.println(cc.getValue());
        cc = multiplier.calculate(c);
        System.out.println(cc.getValue());
    }
}
