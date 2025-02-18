package reflections.dynamicobjectcreation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class DynamicObjectCreatorTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testDynamicObjectCreation() {
        try {
            // Load the Student class dynamically
            Class<?> clazz = Class.forName("reflections.dynamicobjectcreation.Student");

            // Create an instance of Student using reflection
            Object studentObject = clazz.getDeclaredConstructor().newInstance();

            assertNotNull(studentObject, "Student object should not be null");

            // Get and invoke the displayInfo() method
            Method displayMethod = clazz.getMethod("displayInfo");
            displayMethod.invoke(studentObject);

            // Capture console output and verify expected output
            String consoleOutput = outputStream.toString().trim();
            assertEquals("Student Name: Ashish", consoleOutput, "Method displayInfo() should print correct message");

        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }
}
