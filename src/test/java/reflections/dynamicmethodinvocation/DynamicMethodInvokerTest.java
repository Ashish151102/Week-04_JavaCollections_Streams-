package reflections.dynamicmethodinvocation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

class DynamicMethodInvokerTest {
    private MathOperations mathOperations;
    private Class<?> clazz;

    @BeforeEach
    void setUp() throws Exception {
        mathOperations = new MathOperations();
        clazz = Class.forName("reflections.dynamicmethodinvocation.MathOperations");
    }

    @Test
    void testAdditionMethod() throws Exception {
        Method method = clazz.getMethod("add", int.class, int.class);
        Object result = method.invoke(mathOperations, 5, 3);
        assertEquals(8, result);
    }

    @Test
    void testSubtractionMethod() throws Exception {
        Method method = clazz.getMethod("subtract", int.class, int.class);
        Object result = method.invoke(mathOperations, 10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiplicationMethod() throws Exception {
        Method method = clazz.getMethod("multiply", int.class, int.class);
        Object result = method.invoke(mathOperations, 7, 6);
        assertEquals(42, result);
    }

    @Test
    void testInvalidMethodInvocation() {
        assertThrows(NoSuchMethodException.class, () -> {
            clazz.getMethod("divide", int.class, int.class); // This method does not exist
        });
    }
}
