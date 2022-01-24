import java.util.Scanner;

public class StringCalculatable implements Calculatable {

    private int value;

    public StringCalculatable(String value) {
        try {
            this.value = Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            this.value = option(value);
        }
    }

    private int option(String value) {
        Scanner s = new Scanner(value);
        String str;
        int input = 0;

        if (value.trim().equals("")) {
            throw new IllegalArgumentException("Input is an empty String");
        }
        /*
            String [] words = value.split(" ");
            for (String word : words) {
                System.out.println("word: " + word);
            }
             */
        while (s.hasNext()) { //hasNext() is the boolean version of next() that returns true if this scanner has another token in its input
            str = s.next(); //next() gives the next string
            System.out.println("str: " + str);
            input *= 10;
            switch (str) {
                case "one": input += 1; break;
                case "two": input += 2; break;
                case "three": input += 3; break;
                case "four": input += 4; break;
                case "five": input += 5; break;
                case "six": input += 6; break;
                case "seven": input += 7; break;
                case "eight": input += 8; break;
                case "nine": input += 9; break;
                case "zero": input += 0; break;
                default: throw new IllegalArgumentException("Unknown word: " + str);
            }
        }

        return input;
    }

    public int getValue() {return value;}
    public void negate() {value *= -1;}

    public static void main(String[] args) {
        StringCalculatable s = new StringCalculatable("123");
        System.out.println(s.getValue());
        s.negate();
        System.out.println(s.getValue());
        s.negate();
        System.out.println(s.getValue());

        s = new StringCalculatable("one two three");
        System.out.println(s.getValue());
        s = new StringCalculatable("one two three four five");
        System.out.println(s.getValue());

    }

}
