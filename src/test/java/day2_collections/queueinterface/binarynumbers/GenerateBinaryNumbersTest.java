package day2_collections.queueinterface.binarynumbers;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryNumbersTest {

    @Test
    void testGenerateNumbers_SmallN() {
        Queue<String> expected = new LinkedList<>(Arrays.asList("1", "10", "11", "100", "101"));
        assertEquals(expected, GenerateBinaryNumbers.generateNumbers(5));
    }

    @Test
    void testGenerateNumbers_SingleElement() {
        Queue<String> expected = new LinkedList<>(Collections.singletonList("1"));
        assertEquals(expected, GenerateBinaryNumbers.generateNumbers(1));
    }

    @Test
    void testGenerateNumbers_ZeroElements() {
        Queue<String> expected = new LinkedList<>();
        assertEquals(expected, GenerateBinaryNumbers.generateNumbers(0));
    }

    @Test
    void testGenerateNumbers_LargerN() {
        Queue<String> expected = new LinkedList<>(Arrays.asList("1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010"));
        assertEquals(expected, GenerateBinaryNumbers.generateNumbers(10));
    }
}
