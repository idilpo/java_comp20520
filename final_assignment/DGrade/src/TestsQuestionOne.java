
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

public class TestsQuestionOne {

    @Test
    public void testInterface() { // testing the interface: Building
        Method [] methods = Building.class.getMethods();

        int count = 0; // count keeps track of the correctly named methods
        for (Method m : methods) {
            if (m.getName().trim().equalsIgnoreCase("getNumWindows"))
                count++;
            else if (m.getName().trim().equalsIgnoreCase("getFloorSpace"))
                count++;
            else if (m.getName().trim().equalsIgnoreCase("getTotalFloorSpace"))
                count++;
            else if (m.getName().trim().equalsIgnoreCase("addRoom"))
                count++;
        }

        assertEquals(4, count);
        assertTrue(Building.class.isInterface());
    }


    // deep checks for methods in classes House, Bungalow and Estate:
    // (these test methods check if the inputs and outputs are correct for each method)
    @Test
    public void testGetNumWindows () {
        try {
            Method h; Method b; Method e;
            // input checks:
            h = House.class.getDeclaredMethod("getNumWindows", null);
            b = Bungalow.class.getDeclaredMethod("getNumWindows", null);
            e = Estate.class.getDeclaredMethod("getNumWindows", null);
            // output checks:
            assertTrue(h.getReturnType().equals(int.class));
            assertTrue(b.getReturnType().equals(int.class));
            assertTrue(e.getReturnType().equals(int.class));
        } catch (NoSuchMethodException ex) { // in case of an error
            fail("getNumWindows method is not implemented correctly.");
        }
    }
    @Test
    public void testGetFloorSpace () {
        try {
            Method h; Method b;
            // input checks:
            h = House.class.getDeclaredMethod("getFloorSpace", int.class);
            b = Bungalow.class.getDeclaredMethod("getFloorSpace", int.class);
            // output checks:
            assertTrue(h.getReturnType().equals(double.class));
            assertTrue(b.getReturnType().equals(double.class));
        } catch (NoSuchMethodException ex) { // in case of an error
            fail("getFloorSpace method is not implemented correctly.");
        }
    }
    @Test
    public void testGetTotalFloorSpace () {
        try {
            Method h; Method b;
            // input checks:
            h = House.class.getDeclaredMethod("getTotalFloorSpace", null);
            b = Bungalow.class.getDeclaredMethod("getTotalFloorSpace", null);
            // output checks:
            assertTrue(h.getReturnType().equals(double.class));
            assertTrue(b.getReturnType().equals(double.class));
        } catch (NoSuchMethodException ex) { // in case of an error
            fail("getTotalFloorSpace method is not implemented correctly.");
        }
    }
    @Test
    public void testAddRoom () {
        try {
            Method h; Method b;
            // input checks:
            h = House.class.getDeclaredMethod("addRoom", double.class, int.class);
            b = Bungalow.class.getDeclaredMethod("addRoom", double.class, int.class);
            // output checks:
            assertTrue(h.getReturnType().equals(void.class));
            assertTrue(b.getReturnType().equals(void.class));
        } catch (NoSuchMethodException ex) { // in case of an error
            fail("addRoom method is not implemented correctly.");
        }
    }
    // deep checks for methods in class Estate:
    @Test
    public void testCalculateArea () {
        try {
            Method e;
            e = Estate.class.getDeclaredMethod("calculateArea", null); // input check
            assertTrue(e.getReturnType().equals(double.class)); // output check
        } catch (NoSuchMethodException ex) { // in case of an error
            fail("calculateArea method is not implemented correctly.");
        }
    }
    @Test
    public void testAddBuilding () {
        try {
            Method e;
            e = Estate.class.getDeclaredMethod("addBuilding", Building.class); // input check
            assertTrue(e.getReturnType().equals(void.class)); // output check
        } catch (NoSuchMethodException ex) { // in case of an error
            fail("addBuilding method is not implemented correctly.");
        }
    }


    // these test cases check for validation errors:
    @Test
    public void testExceptions () {
        RuntimeException r = assertThrows(RuntimeException.class, () -> new House(-1));
        assertTrue(r instanceof IllegalArgumentException);
        assertNotNull(r.getMessage());

        r = (assertThrows(RuntimeException.class, () -> new House(-2)));
        assertTrue(r instanceof IllegalArgumentException);
        assertNotNull(r.getMessage());

        r = (assertThrows(RuntimeException.class, () -> new House(-3)));
        assertTrue(r instanceof IllegalArgumentException);
        assertNotNull(r.getMessage());

        RuntimeException u = assertThrows(RuntimeException.class, () -> new Estate(null, 55, 100));
        assertTrue(u instanceof IllegalArgumentException);
        assertNotNull(u.getMessage());

        u = assertThrows(RuntimeException.class, () -> new Estate(null, 2, -20));
        assertTrue(u instanceof IllegalArgumentException);
        assertNotNull(u.getMessage());
    }


    @Test
    public void testHouse() {
        Building house = new House(2);
        assertTrue(house instanceof House);
        house.addRoom(10, 0);
        house.addRoom(15, 0);
        house.addRoom(20, 1);
        house.addRoom(5, 1);

        assertEquals(8, house.getNumWindows());
        assertEquals(50, house.getTotalFloorSpace());
        assertEquals(25, house.getFloorSpace(0));
        assertEquals(25, house.getFloorSpace(1));
        assertEquals("House: 8 windows, 4 Rooms, Floor Space: 50.0, and 2 Floors", house.toString());

    }


    @Test
    public void testBungalow() {
        Building house = new Bungalow();
        assertTrue(house instanceof Bungalow);
        house.addRoom(10, 0);
        house.addRoom(30, 0);

        assertEquals(4, house.getNumWindows());
        assertEquals(40, house.getTotalFloorSpace());
        assertEquals(40, house.getFloorSpace(0));
        assertEquals("Bungalow: 4 windows, 2 Rooms, Floor Space: 40.0, and 1 Floor", house.toString());
    }


    @Test
    public void testEstate() {
        Estate e = new Estate(null, 2, 160);

        Building house = new House(2);
        house.addRoom(10, 0);
        house.addRoom(15, 0);
        house.addRoom(20, 1);

        Building bungalow = new Bungalow();
        bungalow.addRoom(10, 0);
        bungalow.addRoom(30, 0);

        e.addBuilding(house);
        //largest room is 25, so area is 25 + (25 * 2) = 75
        assertEquals(75, e.calculateArea());

        e.addBuilding(bungalow);
        //bungalow is 40 + (40 * (2 / 2)) = 40 + 40 = 80
        //75 (house) + 80 (bungalow) = 155
        assertEquals(155, e.calculateArea());

        //house has 4 (2 per floor) + 3 (one per room) = 7
        //bungalow has 2 (2 per floor) + 2 (one per room) = 4
        //7 + 4 = 11
        assertEquals(11, e.getNumWindows());

        try {
            e.addBuilding(bungalow);
            //max area is 160
            //before adding bungalow again, area is 155
            //adding it again takes the area to 155 + 80 = 235
            //235 > 160 therefore this should case an error
            fail("max estate area was exceeded");
        } catch (Exception ex) {}

    }

    // Getters/setters in Java are good examples of code that usually doesn’t contain any logic, and doesn’t require testing.
}


