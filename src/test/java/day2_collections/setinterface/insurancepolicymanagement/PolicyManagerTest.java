package day2_collections.setinterface.insurancepolicymanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class PolicyManagerTest {
    private PolicyManager manager;
    private Policy policy1, policy2, policy3, policy4, duplicatePolicy;

    @BeforeEach
    void setUp() {
        manager = new PolicyManager();

        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DAY_OF_YEAR, 10);  // Expires in 10 days
        Date expiry1 = cal.getTime();

        cal.add(Calendar.DAY_OF_YEAR, 40);  // Expires in 50 days
        Date expiry2 = cal.getTime();

        policy1 = new Policy(201, "Alice", expiry1, "Health", 5000.0);
        policy2 = new Policy(202, "Bob", expiry2, "Car", 7000.0);
        policy3 = new Policy(203, "Charlie", expiry1, "Home", 9000.0);
        policy4 = new Policy(204, "David", expiry2, "Health", 11000.0);
        duplicatePolicy = new Policy(201, "Alice", expiry1, "Health", 5000.0);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);
        manager.addPolicy(duplicatePolicy); // Duplicate entry
    }

    @Test
    void testAddPolicy() {
        assertEquals(4, manager.hashSetPolicies.size());  // No duplicate allowed
    }

    @Test
    void testDisplayExpiringPolicies() {
        // Should include only policies that expire within 30 days
        assertTrue(manager.treeSetPolicies.contains(policy1));
        assertTrue(manager.treeSetPolicies.contains(policy3));
    }

    @Test
    void testDisplayPoliciesWithCoverageType() {
        manager.displayPoliciesWithCoverageType("Health");

        // Only two policies have "Health" coverage
        assertTrue(manager.hashSetPolicies.contains(policy1));
        assertTrue(manager.hashSetPolicies.contains(policy4));
    }

    @Test
    void testDisplayDuplicatePolicies() {
        manager.displayDuplicatePolicies();

        // Duplicate policy should not be counted in the Set
        assertEquals(4, manager.hashSetPolicies.size());
    }
}
