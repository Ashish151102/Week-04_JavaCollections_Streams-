package day2_collections.queueinterface.reversequeue;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {

    @Test
    void testReverseQueue_SmallQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(50, 40, 30, 20, 10));
        assertEquals(expected, ReverseQueue.reverseQueue(queue));
    }

    @Test
    void testReverseQueue_SingleElement() {
        Queue<Integer> queue = new LinkedList<>(Collections.singletonList(1));
        Queue<Integer> expected = new LinkedList<>(Collections.singletonList(1));
        assertEquals(expected, ReverseQueue.reverseQueue(queue));
    }

    @Test
    void testReverseQueue_EmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> expected = new LinkedList<>();
        assertEquals(expected, ReverseQueue.reverseQueue(queue));
    }

    @Test
    void testReverseQueue_LargerQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        assertEquals(expected, ReverseQueue.reverseQueue(queue));
    }
}
