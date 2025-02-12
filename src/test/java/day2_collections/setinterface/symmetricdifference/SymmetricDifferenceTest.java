package day2_collections.setinterface.symmetricdifference;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {

    @Test
    void testSymmetricDifference_CommonElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expectedSet = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expectedSet, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_NoCommonElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> expectedSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(expectedSet, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_IdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> expectedSet = new HashSet<>();
        assertEquals(expectedSet, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_EmptyFirstSet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> expectedSet = new HashSet<>(Arrays.asList(1, 2, 3));
        assertEquals(expectedSet, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_EmptySecondSet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> expectedSet = new HashSet<>(Arrays.asList(1, 2, 3));
        assertEquals(expectedSet, SymmetricDifference.symmetricDifference(set1, set2));
    }
}
