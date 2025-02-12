package day2_collections.listinterface.removeduplicates;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_WithDuplicates() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 3, 2, 1, 4, 5, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 1, 2, 4, 5));
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates_NoDuplicates() {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        List<String> expected = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates_EmptyList() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates_SingleElement() {
        List<Integer> list = new ArrayList<>(Collections.singletonList(42));
        List<Integer> expected = new ArrayList<>(Collections.singletonList(42));
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicates_MultipleDuplicates() {
        List<Character> list = new ArrayList<>(Arrays.asList('A', 'A', 'A', 'B', 'B', 'C'));
        List<Character> expected = new ArrayList<>(Arrays.asList('A', 'B', 'C'));
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }
}
