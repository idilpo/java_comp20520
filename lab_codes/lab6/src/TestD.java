
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;
import org.junit.Test;

public class TestD {

    @Test
    public void testPartDTypeOne() {
        // -example 1-
        Calculatable c1 = new StringCalculatable("-one two three four five");
        assertEquals(-12345, c1.getValue());

        c1 = new StringCalculatable("one two three four five");
        assertEquals(12345, c1.getValue());

        c1 = new StringCalculatable("five five five");
        assertEquals(555, c1.getValue());

        c1 = new StringCalculatable("five five five five five five five five five");
        assertEquals(555555555, c1.getValue());

        c1 = new StringCalculatable("one two three four five six seven eight nine zero");
        assertEquals(1234567890, c1.getValue());
    }

    @Test
    public void testPartDTypeTwo() {
        // -example 2-
        Calculatable c2 = new StringCalculatable("123");
        c2.negate();
        assertEquals(-123, c2.getValue());

        c2 = new StringCalculatable("123");
        c2.negate();
        assertEquals(-123, c2.getValue());

        c2 = new StringCalculatable("1234567");
        assertEquals(1234567, c2.getValue());
    }

    @Test
    public void testErrors() {
        // checking the lambda expression:
        RuntimeException e = assertThrows(RuntimeException.class, () ->
                new StringCalculatable("ten two three four five"));

        assertTrue(e instanceof IllegalArgumentException);
        assertNotNull(e.getMessage());

        e = assertThrows(RuntimeException.class, () ->
                new StringCalculatable("one -two three four five"));

        e = assertThrows(RuntimeException.class, () ->
                new StringCalculatable("one two java four five"));

        e = assertThrows(RuntimeException.class, () ->
                new StringCalculatable("a loada rubbish"));
    }

}

