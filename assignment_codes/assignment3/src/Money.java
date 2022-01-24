
public class Money {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public Money(int wholeNumber, int decimalPart, boolean positive, char currencySymbol) {
        this.wholeNumber = wholeNumber;
        this.decimalPart = decimalPart;
        this.positive = positive;
        this.currencySymbol = currencySymbol;

        if (wholeNumber < 0) {
            throw new IllegalArgumentException("Failure");
        }
        if (decimalPart > 99 || decimalPart < 0) {
            throw new IllegalArgumentException("Failure");
        }
        if (currencySymbol != '$' && currencySymbol != '€' && currencySymbol != '£') {
            throw new IllegalArgumentException("Failure");
        }

    }

    public int getWholeNumber() {return wholeNumber;}
    public int getDecimalPart() {return decimalPart;}
    public boolean isPositive() {return positive;}
    public char getCurrencySymbol() {return currencySymbol;}

    public void setWholeNumber(int wholeNumber) {
        this.wholeNumber = wholeNumber;
        if (wholeNumber < 0) {
            throw new IllegalArgumentException("Failure");
        }
    }

    public void setDecimalPart(int decimalPart) {
        this.decimalPart = decimalPart;
        if (decimalPart > 99 || decimalPart < 0) {
            throw new IllegalArgumentException("Failure");
        }
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public void setCurrencySymbol(char currencySymbol) {
        this.currencySymbol = currencySymbol;
        if (currencySymbol != '$' && currencySymbol != '€' && currencySymbol != '£') {
            throw new IllegalArgumentException("Failure");
        }
    }

    public static void main(String[] args) {
        Money m1 = new Money(1, 1, true, '$');
        Money m2 = new Money(200, 10, true, '€');
        System.out.println(m1.greaterThan(m2));
    }

   public String toString () {
        String start;
        if (positive==false) {
            start = "-";
        } else {start = "";}
        String middle = "" + currencySymbol + wholeNumber + ".";
        String end = "" + decimalPart;
        if (decimalPart < 10) {
            end = "0" + decimalPart;
            return start + middle + end;
        }
        else {return start + middle + end;}
   }
   // (x<0)? "-" : "" + currencySymbol + wholeNumber + (decimalPart<10)? "0" : "" + decimal;

    public boolean equals(Money m) {
        if (this.positive == m.positive && this.currencySymbol == m.currencySymbol && this.wholeNumber == m.wholeNumber && this.decimalPart == m.decimalPart) {return true;}
        else {return false;}
    }

    public boolean greaterThan (Money m) {
        if (positive != m.positive) {return positive;}
        else {
            if (wholeNumber > m.wholeNumber) {return true;}
            else if(wholeNumber < m.wholeNumber) {return false;}
            else {
                if (decimalPart > m.decimalPart) {return true;}
                else if (decimalPart < m.decimalPart) {return false;}
                else {return false;}
            }
        }
    }
}




