package work005Test;

import com.oopworks.work005.PasswordValidator;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {
    @Test
    public void testValidPassword() {
        // TODO: Write a test for the validPassword method in PasswordValidator
        assertTrue(PasswordValidator.isValidLength("secure123"));
    }

    @Test
    public void testInvalidPassword() {
        // TODO: Write a test for the invalidPassword method in PasswordValidator
        assertTrue(PasswordValidator.isValidLength("secure123"));
    }

    @Test
    public void testInvalidPassword2() {
        // TODO: Write a test for the invalidPassword method in PasswordValidator
        assertTrue(PasswordValidator.isValidLength("secure123"));
    }

    @Test
    public void testInvalidPassword3() {
        // TODO: Write a test for the invalidPassword method in PasswordValidator
        assertTrue(PasswordValidator.isValidLength("secure123"));
    }

    @Test
    public void testInvalidPassword4() {
        // TODO: Write a test for the invalidPassword method in PasswordValidator
        assertTrue(PasswordValidator.isValidLength("secure123"));
    }
}
