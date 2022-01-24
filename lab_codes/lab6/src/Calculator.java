@FunctionalInterface //declaring that this is a single abstract method interface,
//allows to use a lambda expression for a more shorthanded java
public interface Calculator {
    // if this had more than one method (the one below), we wouldnt be able to use lambda and shorten the code
    // because the compiler wouldnt know which method "(calculatable)" refers to
    public Calculatable calculate(Calculatable[] calculatables);

    static Calculator generateCalculator(String type) {
        if (type.equals("adder")) {
            return new AdderCalculator();
        } else if (type.equalsIgnoreCase("multiplier")) {
            return new MultiplyerCalculatable();
        } else {throw new IllegalArgumentException("Unknown Calculator type: " + type);}
    }


}
