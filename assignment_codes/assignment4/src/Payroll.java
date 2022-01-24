
public class Payroll {
    enum PayLevel {ONE, TWO, THREE};
    static double OVERTIME_RATE = 1.5;
    static int REGULAR_WEEK = 40;
    static int LEVEL_ONE_PAY = 15;
    static int LEVEL_TWO_PAY = 25;
    static int LEVEL_THREE_PAY = 40;

    public static void main(String[] args) {
        /* tests for q1:
        System.out.println(OVERTIME_RATE);
        System.out.println(REGULAR_WEEK);
        System.out.println(LEVEL_ONE_PAY);
        System.out.println(LEVEL_TWO_PAY);
        System.out.println(LEVEL_THREE_PAY);
        System.out.println(PayLevel.ONE);
        System.out.println(PayLevel.TWO);
        System.out.println(PayLevel.THREE);
         */

        /* tests for q2:
        System.out.println(Payroll.calculatePay(1, Payroll.PayLevel.ONE));
        System.out.println(Payroll.calculatePay(10, Payroll.PayLevel.TWO));
        System.out.println(Payroll.calculatePay(20, Payroll.PayLevel.THREE));
        System.out.println(Payroll.calculatePay(70, Payroll.PayLevel.TWO));

        try {
            System.out.println(Payroll.calculatePay(100, Payroll.PayLevel.TWO));
        } catch (IllegalArgumentException ex) {
            System.out.println("failure");
        }

        Payroll.REGULAR_WEEK = 20;
        System.out.println(Payroll.calculatePay(25, Payroll.PayLevel.TWO));

        //I'm cheating from here on
        //constants should be final!
        Payroll.OVERTIME_RATE = 2;
        Payroll.REGULAR_WEEK = 40;
        System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.TWO));

        Payroll.OVERTIME_RATE = 1.75;
        Payroll.REGULAR_WEEK = 40;
        Payroll.LEVEL_ONE_PAY = 12;
        System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.ONE));

        Payroll.OVERTIME_RATE = 1.75;
        Payroll.REGULAR_WEEK = 25;
        Payroll.LEVEL_TWO_PAY = 30;
        System.out.println(Payroll.calculatePay(35, Payroll.PayLevel.TWO));

        Payroll.OVERTIME_RATE = 1.75;
        Payroll.REGULAR_WEEK = 40;
        Payroll.LEVEL_THREE_PAY = 50;
        System.out.println(Payroll.calculatePay(10, Payroll.PayLevel.THREE));
         */


    }

    public static double calculatePay(int noHoursWorked, PayLevel p) {
        double hourlyRate;
        if (p == Payroll.PayLevel.ONE) {hourlyRate = LEVEL_ONE_PAY;}
        else if (p == PayLevel.TWO) {hourlyRate = LEVEL_TWO_PAY;}
        else {hourlyRate = LEVEL_THREE_PAY;}

        if (noHoursWorked >= 1 && noHoursWorked <= 80) {
            if (noHoursWorked > REGULAR_WEEK) {
                return (REGULAR_WEEK * hourlyRate) + ((noHoursWorked - REGULAR_WEEK) * OVERTIME_RATE * hourlyRate);
            }
            else {return noHoursWorked * hourlyRate;}
        } else {throw new IllegalArgumentException("failure");}
    }


}
