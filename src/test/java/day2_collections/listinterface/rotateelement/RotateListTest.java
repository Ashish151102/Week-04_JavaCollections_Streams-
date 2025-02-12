package day2_collections.listinterface.rotateelement;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {

    @Test
    void testRotateList_PositiveRotation() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> expected = new ArrayList<>(Arrays.asList(30, 40, 50, 10, 20));
        assertEquals(expected, RotateList.rotateList(list, 2));
    }

    @Test
    void testRotateList_RotationGreaterThanSize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3,4, 5, 1, 2));
        assertEquals(expected, RotateList.rotateList(list, 7)); // 7 % 5 = 2 rotations
    }

    @Test
    void testRotateList_EmptyList() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, RotateList.rotateList(list, 3));
    }

    @Test
    void testRotateList_SingleElement() {
        List<Integer> list = new ArrayList<>(Collections.singletonList(42));
        List<Integer> expected = new ArrayList<>(Collections.singletonList(42));
        assertEquals(expected, RotateList.rotateList(list, 5));
    }

    @Test
    void testRotateList_NoRotation() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        assertEquals(expected, RotateList.rotateList(list, 0));
    }
}
