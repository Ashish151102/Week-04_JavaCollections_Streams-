package day2_collections.listinterface.reverselist;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void testReverseList_ArrayList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        ReverseList.reverseList(list);
        assertEquals(expected, list);
    }

    @Test
    void testReverseList_LinkedList() {
        List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> expected = new LinkedList<>(Arrays.asList(50, 40, 30, 20, 10));
        ReverseList.reverseList(list);
        assertEquals(expected, list);
    }

    @Test
    void testReverseList_SingleElement() {
        List<Integer> list = new ArrayList<>(Collections.singletonList(99));
        List<Integer> expected = new ArrayList<>(Collections.singletonList(99));
        ReverseList.reverseList(list);
        assertEquals(expected, list);
    }

    @Test
    void testReverseList_EmptyList() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        ReverseList.reverseList(list);
        assertEquals(expected, list);
    }
}
