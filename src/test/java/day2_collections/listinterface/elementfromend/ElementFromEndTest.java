package day2_collections.listinterface.elementfromend;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElementFromEndTest {

    @Test
    void testElementFromEnd_ValidCases() {
        List<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        assertEquals('D', ElementFromEnd.elementFromEnd(list, 2));
    }

    @Test
    void testElementFromEnd_FirstElement() {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(6, ElementFromEnd.elementFromEnd(list, 1));
    }

    @Test
    void testElementFromEnd_LastElement() {
        List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40));
        assertEquals(10, ElementFromEnd.elementFromEnd(list, 4));
    }

    @Test
    void testElementFromEnd_EmptyList() {
        List<Integer> list = new LinkedList<>();
        assertThrows(IllegalArgumentException.class, () -> ElementFromEnd.elementFromEnd(list, 1));
    }

    @Test
    void testElementFromEnd_InvalidN() {
        List<String> list = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        assertThrows(IllegalArgumentException.class, () -> ElementFromEnd.elementFromEnd(list, 5));
    }
}
