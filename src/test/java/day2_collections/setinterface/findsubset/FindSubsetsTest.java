package day2_collections.setinterface.findsubset;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FindSubsetsTest {

    @Test
    void testAreSubsets_TrueCase() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(FindSubsets.areSubsets(set1, set2));
    }

    @Test
    void testAreSubsets_FalseCase() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(FindSubsets.areSubsets(set1, set2));
    }

    @Test
    void testAreSubsets_EqualSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        assertTrue(FindSubsets.areSubsets(set1, set2));
    }

    @Test
    void testAreSubsets_EmptySubset() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        assertTrue(FindSubsets.areSubsets(set1, set2));
    }

    @Test
    void testAreSubsets_EmptySuperset() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> set2 = new HashSet<>();
        assertTrue(FindSubsets.areSubsets(set1, set2));
    }
}
