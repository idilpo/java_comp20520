
public class PayClaim {
    int noHoursWorked;
    Payroll.PayLevel payLevel;
    double calculatedPay;

    //constructor and validity checks:
    public PayClaim(int noHoursWorked, Payroll.PayLevel payLevel) {
        this.noHoursWorked = noHoursWorked;
        this.payLevel = payLevel;

        if (this.noHoursWorked < 1 || this.noHoursWorked > 80) {
            throw new IllegalArgumentException("Please enter a valid input.");
        }
    }

    //getters:
    public int getNoHoursWorked() {return noHoursWorked;}
    public Payroll.PayLevel getPayLevel() {return payLevel;}
    public double getCalculatedPay() {return calculatedPay;}
    //setter:
    public void setCalculatedPay(double calculatedPay) {
        if (calculatedPay < 0)  {throw new IllegalArgumentException("Please enter a valid input.");}
        this.calculatedPay = calculatedPay;
    }


    public String toString() {
        if (calculatedPay == 0) {
            if (noHoursWorked == 1) {
                return "PayClaim for " + noHoursWorked + " hour, at PayLevel " + payLevel;
            } else {
                return "PayClaim for " + noHoursWorked + " hours, at PayLevel " + payLevel;
            }
        }
        else {
            if (noHoursWorked == 1) {
                return "PayClaim for " + noHoursWorked + " hour, at PayLevel " + payLevel + ", which gives " + calculatedPay;
            } else {
                return "PayClaim for " + noHoursWorked + " hours, at PayLevel " + payLevel + ", which gives " + calculatedPay;
            }
        }
    }

    public void calculatePay() {
       calculatedPay = Payroll.calculatePay(noHoursWorked, payLevel);
    }

    public static void main(String[] args) {
        /* tests for q3:
        PayClaim p = new PayClaim(1, Payroll.PayLevel.ONE);
        System.out.println(p);

        PayClaim p1 = new PayClaim(10, Payroll.PayLevel.THREE);
        System.out.println(p1);

        PayClaim p2 = new PayClaim(15, Payroll.PayLevel.TWO);
        System.out.println(p2.getNoHoursWorked() + " " + p2.getPayLevel());

        PayClaim p3 = new PayClaim(15, Payroll.PayLevel.TWO);
        p3.setCalculatedPay(100);
        System.out.println(p3);

        try {
            PayClaim p4 = new PayClaim(250, Payroll.PayLevel.ONE);
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        try {
            PayClaim p5 = new PayClaim(25, Payroll.PayLevel.ONE);
            p5.setCalculatedPay(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }
     */

        /* tests for q4:
        Payroll.OVERTIME_RATE = 2;
        Payroll.REGULAR_WEEK = 37;
        Payroll.LEVEL_ONE_PAY = 20;
        PayClaim p = new PayClaim(45, Payroll.PayLevel.ONE);
        p.calculatePay();
        System.out.println(p.getCalculatedPay());

        Payroll.OVERTIME_RATE = 2;
        Payroll.REGULAR_WEEK = 37;
        Payroll.LEVEL_ONE_PAY = 20;
        PayClaim p1 = new PayClaim(45, Payroll.PayLevel.ONE);
        p1.calculatePay();
        System.out.println(p1);

        Payroll.OVERTIME_RATE = 1.25;
        Payroll.REGULAR_WEEK = 55;
        Payroll.LEVEL_TWO_PAY = 40;
        PayClaim p2 = new PayClaim(70, Payroll.PayLevel.TWO);
        p2.calculatePay();
        System.out.println(p2.getCalculatedPay());

        Payroll.OVERTIME_RATE = 1.25;
        Payroll.REGULAR_WEEK = 55;
        Payroll.LEVEL_TWO_PAY = 40;
        PayClaim p3 = new PayClaim(70, Payroll.PayLevel.TWO);
        p3.calculatePay();
        System.out.println(p3);
         */

    }
}
