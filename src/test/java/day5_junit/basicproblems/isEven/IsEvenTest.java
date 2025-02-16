package day5_junit.basicproblems.isEven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class IsEvenTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEvenTrue(int number) {
        assertTrue(IsEven.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsEvenFalse(int number) {
        assertFalse(IsEven.isEven(number), number + " should be odd");
    }

    @Test
    void testIsEvenZero() {
        assertTrue(IsEven.isEven(0), "0 should be even");
    }
}
