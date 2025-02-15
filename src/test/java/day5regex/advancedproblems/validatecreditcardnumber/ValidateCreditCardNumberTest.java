package day5regex.advancedproblems.validatecreditcardnumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateCreditCardNumberTest {

    @Test
    void testIsValid_withValidCreditCardNumbers() {
        assertTrue(ValidateCreditCardNumber.isValid("4123456789012345")); // Visa
        assertTrue(ValidateCreditCardNumber.isValid("5123456789012345")); // MasterCard
        assertTrue(ValidateCreditCardNumber.isValid("5223456789012345"));
    }

    @Test
    void testIsValid_withInvalidCreditCardNumbers() {
        assertFalse(ValidateCreditCardNumber.isValid("6123456789012345")); // Starts with 6
        assertFalse(ValidateCreditCardNumber.isValid("3123456789012345")); // Starts with 3
        assertFalse(ValidateCreditCardNumber.isValid("51234567890123")); // Too short
        assertFalse(ValidateCreditCardNumber.isValid("51234567890123456")); // Too long
        assertFalse(ValidateCreditCardNumber.isValid("abcdefg123456789")); // Non-numeric characters
    }

    @Test
    void testIsValid_withEmptyString() {
        assertFalse(ValidateCreditCardNumber.isValid(""));
    }

    @Test
    void testIsValid_withNonNumericCharacters() {
        assertFalse(ValidateCreditCardNumber.isValid("51ab345678901234"));
    }
}
