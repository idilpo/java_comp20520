/*
import java.util.Scanner;

public class CashRegister2 {
    public double money;
    public double d;
    public double balance;

    public double getMoney() {return this.money;}
    public void setMoney() {this.money = money;}

    public CashRegister2() {
        if (money < 0) {
            throw new IllegalArgumentException("Please enter a valid input.");
        }
    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        String amount = input1.nextLine();
        double money = Double.parseDouble(amount);

        CashRegister2 Money = new CashRegister2();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter d: ");
        String str_d = input2.nextLine();
        double d = Double.parseDouble(str_d);

        Money.add();
        Money.remove();
        Money.toString();

    }

    public double add() {
        if (d > 0) {
            balance = money + d;
            return balance;
        } else {
            throw new IllegalArgumentException("Please enter a valid input.");
        }
    }

    public double remove() {
        if (d>0 && money>d) {
            balance = money - d;
            return balance;
        } else {
            throw new IllegalArgumentException("Please enter a valid input.");
        }
    }

    public String toString() {return "Your balance: " + balance;}

}

*/
