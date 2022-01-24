import static org.junit.jupiter.api.Assertions.*;

class CashRegisterTest {

    @org.junit.jupiter.api.Test
    void getMoney() {
    }

    @org.junit.jupiter.api.Test
    void setMoney() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        CashRegister cr = new CashRegister(50);
        //for valid inputs:
        cr.add(50);
        //expected value and thee 2nd is same = assertEquals flags as correct
        assertEquals(101, cr.getMoney());

        //for invalid inputs:
        try {
            cr.add(-100);
            fail("negative number");
        } catch (IllegalArgumentException ex) {}

    }
}