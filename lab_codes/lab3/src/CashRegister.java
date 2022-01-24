import java.util.Scanner;
import java.util.ArrayList;

public class CashRegister {
    private double money;
    private ArrayList<String> transactions;

    public CashRegister(double m) {
        this.money = m;
        //don't forget to instantiate the arraylist in your constructor!!!
        transactions = new ArrayList<String>();
        if (this.money < 0) {
            throw new IllegalArgumentException("Please enter a valid input.");
        }
    }

    public double getMoney() {return this.money;}
    public void setMoney(double money) {this.money = money;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //only needs to be declared once
        System.out.print("Enter the amount: ");
        String amount = input.nextLine(); //str input
        double money = Double.parseDouble(amount); //str input changed to a double

        CashRegister CR1 = new CashRegister(money); //first instance of the class

        System.out.print("Enter d: ");
        String str_d = input.nextLine();
        double d = Double.parseDouble(str_d);

        CR1.add(d);
        //System.out.println(CR1);
        CR1.remove(d);
        //System.out.println(CR1);
        CR1.toString();



        System.out.print("Enter the amount: ");
        amount = input.nextLine();
        money = Double.parseDouble(amount);

        CashRegister CR2 = new CashRegister(money); //second instance of the class

        System.out.print("Enter d: ");
        str_d = input.nextLine();
        d = Double.parseDouble(str_d);

        CR2.add(d);
        //System.out.println(CR2);
        CR2.remove(d);
        //System.out.println(CR2);
        CR2.toString();

        System.out.println(CR1.equals(CR1));
        System.out.println(CR1.equals(CR2));
        //if checking for more than 2 instances --> CR1.equals(CR2, CR3, CR4, ...);

        CR2.setMoney(75);
        System.out.println(CR1.equals(CR2));

        //example of error testing:
        /*
        try {
            CR1.add(-50);
        } catch (IllegalArgumentException ex) {
            //ex.printStackTrace(); --> gives an error of the error
            System.out.println(ex.getMessage()); //gives a message of the error
        }
         */

        //CR1.printTransactions();
        CR1.printTransactions(2);
        CR1.add(40);
        CR1.remove(7);
        //CR1.printTransactions();
        CR1.printTransactions(3);

    }
    public void add(double d) {
        if (d > 0) {
            this.money = this.money + d;
        } else {
            throw new IllegalArgumentException("Please enter a valid input.");
        }
        transactions.add(d + "added, new balance: " + this.money);
    }

    public void remove(double d) {
        if (d>0 && this.money>d) {
            this.money = this.money - d;
        } else {
            throw new IllegalArgumentException("Please enter a valid input.");
        }
        transactions.remove(d + "removed, new balance: " + this.money);
    }

    public String toString() {return "Your balance: " + getMoney();} // could also say + this.money

    public boolean equals(Object obj) {
        //to compare cashregister w any kind of obj:
        //need to check first if the obj is an instance of the class:
        if (obj instanceof CashRegister) { //(due to polymorphism) a way of determining one of the possible types an obj has
            // CashRegister CR1 = (CashRegister)obj; --> casting
            //left bit isnt going to be used so can also do it like this:
            return ((CashRegister)obj).getMoney() == money;
        } else {
            return false;
        }
    }

    /*
    public void printTransactions() {
        for (String s: transactions) {
            System.out.println(s);
        }
    }
     */

    public void printTransactions(int n) {
        //looping backwards:
        for (int i = transactions.size()-1; (i>=transactions.size()-n && i>=0); i--) {
            System.out.println(transactions.get(i)); //.get = get element
        }
    }

}



