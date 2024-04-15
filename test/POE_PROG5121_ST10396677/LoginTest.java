package POE_PROG5121_ST10396677;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    // Test method to check if a valid password passes
    @Test
    public void testValidPassword() {
        assertTrue("Valid password must be accepted", Login.checkPasswordComplexity("GoodP@ss1"));
    }

    // Test method to check if a password without digits fails
    @Test
    public void testPasswordWithoutDigits() {
        assertFalse("Password without digits should fail", Login.checkPasswordComplexity("Badpass!word"));
    }

    // Test method to check if a password without uppercase letters fails
    @Test
    public void testPasswordWithoutUppercase() {
        assertFalse("Password without uppercase letters should fail", Login.checkPasswordComplexity("badpass1!"));
    }

    // Test method to check if a password without lowercase letters fails
    @Test
    public void testPasswordWithoutLowercase() {
        assertFalse("Password without lowercase letters should fail", Login.checkPasswordComplexity("BADPASS1!"));
    }

    // Test method to check if a password without special characters fails
    @Test
    public void testPasswordWithoutSpecialChar() {
        assertFalse("Password without special characters should fail", Login.checkPasswordComplexity("Badpass1"));
    }

    // Test method to check if a password that is too short fails
    @Test
    public void testTooShortPassword() {
        assertFalse("Password too short should fail", Login.checkPasswordComplexity("Bad1!"));
    }

    // Test method to check if a password that is too long fails
    @Test
    public void testTooLongPassword() {
        assertFalse("Password too long should fail", Login.checkPasswordComplexity("Verylongpassword1!ThisIsTooMuch"));
    }

    // Test method to check if a password with spaces fails
    @Test
    public void testPasswordWithSpaces() {
        assertFalse("Password with spaces should fail", Login.checkPasswordComplexity("Bad pass1!"));
    }
}
