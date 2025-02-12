package day2_collections.setinterface.sortingsetelements;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SortingSetElementsTest {

    @Test
    void testSortElements_IntegerSet() {
        Set<Integer> inputSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        Set<Integer> expectedSet = new TreeSet<>(Arrays.asList(1, 3, 5, 9));
        assertEquals(expectedSet, SortingSetElements.sortElements(inputSet));
    }

    @Test
    void testSortElements_StringSet() {
        Set<String> inputSet = new HashSet<>(Arrays.asList("banana", "apple", "cherry"));
        Set<String> expectedSet = new TreeSet<>(Arrays.asList("apple", "banana", "cherry"));
        assertEquals(expectedSet, SortingSetElements.sortElements(inputSet));
    }

    @Test
    void testSortElements_EmptySet() {
        Set<Integer> inputSet = new HashSet<>();
        Set<Integer> expectedSet = new TreeSet<>();
        assertEquals(expectedSet, SortingSetElements.sortElements(inputSet));
    }

    @Test
    void testSortElements_SingleElementSet() {
        Set<Integer> inputSet = new HashSet<>(Collections.singleton(42));
        Set<Integer> expectedSet = new TreeSet<>(Collections.singleton(42));
        assertEquals(expectedSet, SortingSetElements.sortElements(inputSet));
    }
}
