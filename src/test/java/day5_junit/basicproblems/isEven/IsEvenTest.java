package day5_junit.basicproblems.isEven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IsEvenTest {

    @Test
    void testEvenNumber() {
        assertTrue(IsEven.isEven(4), "4 should be even");
        assertTrue(IsEven.isEven(0), "0 should be even");
        assertTrue(IsEven.isEven(-2), "-2 should be even");
    }

    @Test
    void testOddNumber() {
        assertFalse(IsEven.isEven(3), "3 should be odd");
        assertFalse(IsEven.isEven(-5), "-5 should be odd");
        assertFalse(IsEven.isEven(7), "7 should be odd");
    }
}
