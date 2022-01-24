
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;
import org.junit.Test;

public class TestA {

    @Test
    public void testGetValue() {
        // interrogating the methods that the interface has by creating an array of methods:
        Method [] methods = Calculatable.class.getDeclaredMethods();
        assertEquals(methods.length, 2); //checking to see if there are 2 methods

        try {
            Method m;
            // checking the spelling and if it takes no input (null) or not:
            m = Calculatable.class.getDeclaredMethod("getValue", null);
            // checking the return type of the method:
            assertTrue(m.getReturnType().equals(int.class));
        } catch (NoSuchMethodException ex) {
            fail("No getValue method");
        }
    }

    @Test
    public void testNegate() {
        Method m;

        try {
            m = Calculatable.class.getDeclaredMethod("negate", null);
            // does the method have no return (void) type?:
            assertTrue(m.getReturnType().equals(void.class));
        } catch (NoSuchMethodException ex) {
            fail("No negate method");
        }
    }
}

