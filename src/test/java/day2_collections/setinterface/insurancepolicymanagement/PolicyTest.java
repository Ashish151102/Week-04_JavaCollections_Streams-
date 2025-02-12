package day2_collections.setinterface.insurancepolicymanagement;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class PolicyTest {

    @Test
    void testPolicyCreationAndGetters() {
        Date expiryDate = new Date();
        Policy policy = new Policy(101, "John Doe", expiryDate, "Health", 5000.0);

        assertEquals(101, policy.getPolicyNumber());
        assertEquals("John Doe", policy.getPolicyHolderName());
        assertEquals(expiryDate, policy.getExpiryDate());
        assertEquals("Health", policy.getCoverageType());
        assertEquals(5000.0, policy.getPremiumAmount());
    }

    @Test
    void testPolicyEquality() {
        Date expiryDate = new Date();
        Policy policy1 = new Policy(102, "Alice", expiryDate, "Car", 6000.0);
        Policy policy2 = new Policy(102, "Alice", expiryDate, "Car", 6000.0);
        Policy policy3 = new Policy(103, "Bob", expiryDate, "Home", 7000.0);

        assertEquals(policy1, policy2);
        assertNotEquals(policy1, policy3);
    }

    @Test
    void testPolicyHashCode() {
        Date expiryDate = new Date();
        Policy policy1 = new Policy(104, "Eve", expiryDate, "Life", 8000.0);
        Policy policy2 = new Policy(104, "Eve", expiryDate, "Life", 8000.0);

        assertEquals(policy1.hashCode(), policy2.hashCode());
    }

    @Test
    void testPolicyComparison() {
        Date date1 = new Date(System.currentTimeMillis() + 100000);  // Future date
        Date date2 = new Date(System.currentTimeMillis() + 200000);  // Further future date

        Policy policy1 = new Policy(105, "Charlie", date1, "Health", 9000.0);
        Policy policy2 = new Policy(106, "David", date2, "Car", 10000.0);

        assertTrue(policy1.compareTo(policy2) < 0);
        assertTrue(policy2.compareTo(policy1) > 0);
    }
}
