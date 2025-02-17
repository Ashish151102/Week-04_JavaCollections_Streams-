package day5_junit.basicproblems.performancetester;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTesterTest {

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS) // Ensures the method completes within 4 seconds
    void testLongRunningTask() {
        String result = PerformanceTester.longRunningTask();
        assertEquals("Task Completed", result, "The method did not return the expected output");
    }
}
