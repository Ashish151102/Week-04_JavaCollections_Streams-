package day2_collections.setinterface.unionandintersection;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionTest {

    @Test
    void testUnion_CommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("Aditya", "Ashish", "Harsh", "Aman"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Harsh", "Piyush", "Rohit", "Ashish"));
        Set<String> expectedSet = new HashSet<>(Arrays.asList("Aditya", "Ashish", "Harsh", "Aman", "Piyush", "Rohit"));
        assertEquals(expectedSet, UnionAndIntersection.union(set1, set2));
    }

    @Test
    void testUnion_NoCommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("D", "E", "F"));
        Set<String> expectedSet = new HashSet<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        assertEquals(expectedSet, UnionAndIntersection.union(set1, set2));
    }

    @Test
    void testIntersection_CommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("Aditya", "Ashish", "Harsh", "Aman"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Harsh", "Piyush", "Rohit", "Ashish"));
        Set<String> expectedSet = new HashSet<>(Arrays.asList("Harsh", "Ashish"));
        assertEquals(expectedSet, UnionAndIntersection.intersection(set1, set2));
    }

    @Test
    void testIntersection_NoCommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("D", "E", "F"));
        Set<String> expectedSet = new HashSet<>();
        assertEquals(expectedSet, UnionAndIntersection.intersection(set1, set2));
    }
}