package reflections.classinformation; // Fixed package name

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class ClassInformationRetrieverTest {

    @Test
    void testClassInformationRetrieval() throws Exception {
        Class<?> clazz = Class.forName("reflections.classinformation.SampleClass"); // Fixed package name

        // Check class name
        assertEquals("reflections.classinformation.SampleClass", clazz.getName()); // Fixed expected value

        // Check methods
        Method[] methods = clazz.getDeclaredMethods();
        assertNotNull(methods);
        assertTrue(methods.length > 0);

        // Check fields
        Field[] fields = clazz.getDeclaredFields();
        assertNotNull(fields);

        // Check constructors
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        assertNotNull(constructors);
        assertTrue(constructors.length > 0);
    }
}

// Sample class to test reflection
class SampleClass {
    private int id;
    private String name;

    public SampleClass() {}

    public void sampleMethod() {}
}
