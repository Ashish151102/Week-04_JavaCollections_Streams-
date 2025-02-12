package day2_collections.listinterface.findingfrequency;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void testFindFrequency_ValidCase() {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple", "cherry", "orange"));
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 2);
        expected.put("cherry", 1);
        assertEquals(expected, Frequency.findFrequency(list));
    }

    @Test
    void testFindFrequency_EmptyList() {
        List<String> list = new ArrayList<>();
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Frequency.findFrequency(list));
    }

    @Test
    void testFindFrequency_SingleElement() {
        List<String> list = new ArrayList<>(Collections.singletonList("apple"));
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);
        assertEquals(expected, Frequency.findFrequency(list));
    }

    @Test
    void testFindFrequency_AllUnique() {
        List<String> list = new ArrayList<>(Arrays.asList("dog", "cat", "fish"));
        Map<String, Integer> expected = new HashMap<>();
        expected.put("dog", 1);
        expected.put("cat", 1);
        expected.put("fish", 1);
        assertEquals(expected, Frequency.findFrequency(list));
    }

    @Test
    void testFindFrequency_MultipleOccurrences() {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "A"));
        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 3);
        expected.put("B", 2);
        expected.put("C", 1);
        assertEquals(expected, Frequency.findFrequency(list));
    }
}
