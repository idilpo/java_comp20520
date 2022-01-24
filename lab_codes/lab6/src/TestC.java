
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class TestC {

    @Test
    public void testFunctional() {
        SimpleCalculatable s = new SimpleCalculatable(1);
        // checks to see if you're using the interface:
        assertTrue(s instanceof Calculatable);

        assertEquals(1, s.getValue());

        s.negate();
        assertEquals(-1, s.getValue());

        s = new SimpleCalculatable(100);

        assertEquals(100, s.getValue());

        s.negate();
        assertEquals(-100, s.getValue());

        s = new SimpleCalculatable(-2100);

        assertEquals(-2100, s.getValue());

        s.negate();
        assertEquals(2100, s.getValue());
    }

}
