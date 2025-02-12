package day2_collections.setinterface.areequal;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class AreEqualTest {

    @Test
    void testAreEqual_EqualSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertTrue(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqual_DifferentSizes() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        assertFalse(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqual_DifferentElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        assertFalse(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqual_EmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        assertTrue(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqual_SingleElementDifferent() {
        Set<String> set1 = new HashSet<>(Collections.singleton("apple"));
        Set<String> set2 = new HashSet<>(Collections.singleton("banana"));
        assertFalse(AreEqual.areEqual(set1, set2));
    }
}
