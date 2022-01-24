
import static org.junit.jupiter.api.Assertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.junit.Test;

public class TestB {

    @Test
    public void testMethod() {
        Method [] methods = Calculator.class.getDeclaredMethods();
        assertEquals(methods.length, 1);

        try {
            Method m = Calculator.class.getDeclaredMethod("calculate", Calculatable[].class);
            assertTrue(m.getReturnType().equals(Calculatable.class));
        } catch (NoSuchMethodException ex) {
            fail("No calculate method");
        }
    }

    @Test
    public void testInterface() {
        Annotation [] a = Calculator.class.getAnnotations();
        assertEquals(1, a.length);
        // checking the lambda annotation:
        assertTrue(Calculator.class.isAnnotationPresent(FunctionalInterface.class));
    }
}
