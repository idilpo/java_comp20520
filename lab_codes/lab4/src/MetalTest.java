import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetalTest {

    @Test
    void testConstructor() {
        Metal m = new Metal(100, Metal.type.GOLD);

        try {
            m = new Metal(-1, Metal.type.LEAD);
            fail("Constructor permitted negative mass.");
        } catch (IllegalArgumentException ex) {
            assertNotNull(ex.getMessage()); //checks if the error message isnt null (empty)
        }
        catch (Exception ex) {fail("some other error");}

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {m = new Metal(-1, Metal.type.LEAD);});
        assertNotNull(ex.getMessage();
    }

    @Test
    void testGetValue() {
        double val1 = 4875;
        Metal m1 = new Metal(100, Metal.type.GOLD);
        assertEquals(val1, m1.getValue());

        double val2 = 30;
        Metal m2 = new Metal(1000, Metal.type.LEAD);
        assertEquals(val2, m2.getValue());

        double val3 = 0.1;
        Metal m3 = new Metal(10, Metal.type.TIN);
        assertEquals(val3, m3.getValue());
    }

    @Test
    void testToString() {
        Metal m1 = new Metal(100, Metal.type.GOLD);
        String s = "Metal: Gold, Mass: 100 grams, Value: 4875.0";
        assertEquals(s, m1.toString());

        Metal m2 = new Metal(1000, Metal.type.LEAD);
        s = "Metal: Tin, Mass: 1000 grams, Value: 10.0";
        assertEquals(s, m2.toString());

        Metal m3 = new Metal(10, Metal.type.TIN);
        s = "Metal: Lead, Mass: 10 grams, Value: 0.3";
        assertEquals(s, m3.toString());
    }

    @Test
    void testMixWithSame() {
        Metal m4 = new Metal(100, Metal.type.GOLD);
        Metal m5 = new Metal(100, Metal.type.LEAD);
        Metal m6 = new Metal(100, Metal.type.TIN);

        m4.mixWith(m4);
        m5.mixWith(m5);
        m6.mixWith(m6);

        assertEquals(200, m4.getMass());
        assertEquals(Metal.type.GOLD, m4.getType());
        assertEquals(200, m5.getMass());
        assertEquals(Metal.type.LEAD, m5.getType());
        assertEquals(200, m6.getMass());
        assertEquals(Metal.type.TIN, m6.getType());
    }

    @Test
    void testMakeGold() {
        Metal m5 = new Metal(100, Metal.type.TIN);
        Metal m6 = new Metal(100, Metal.type.LEAD);

        m5.mixWith(m6);
        assertEquals(200, m5.getMass());
        assertEquals(Metal.type.GOLD, m5.getType());
        assertEquals(1, m5.getPurity());

        m5 = new Metal(100, Metal.type.TIN);
        m6 = new Metal(100, Metal.type.LEAD);

        m6.mixWith(m5);
        assertEquals(200, m6.getMass());
        assertEquals(Metal.type.GOLD, m6.getType());
        assertEquals(1, m6.getPurity());
    }

    @Test
    void testDiluteGold () {
        Metal m4 = new Metal(100, Metal.type.GOLD);
        Metal m5 = new Metal(100, Metal.type.LEAD);
        Metal m6 = new Metal(400, Metal.type.TIN);

        m4.mixWith(m5);
        assertEquals(200, m4.getMass());
        assertEquals(Metal.type.GOLD, m4.getType());
        assertEquals(0.5, m5.getPurity());

        m4 = new Metal(100, Metal.type.GOLD);
        m4.mixWith(m6);
        assertEquals(500, m4.getMass());
        assertEquals(Metal.type.LEAD, m4.getType());
        assertEquals(1, m4.getPurity());

        m4 = new Metal(100, Metal.type.GOLD);
        m5 = new Metal(100, Metal.type.LEAD);
        m6 = new Metal(400, Metal.type.TIN);

        m5.mixWith(m4);
        assertEquals(200, m5.getMass());
        assertEquals(Metal.type.GOLD, m5.getType());
        assertEquals(0.5, m5.getPurity());

        m6.mixWith(m4);
        assertEquals(500, m6.getMass());
        assertEquals(Metal.type.LEAD, m6.getType());
        assertEquals(0.8, m6.getPurity());
    }
}