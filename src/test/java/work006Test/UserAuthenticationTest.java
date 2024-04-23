package work006Test;

import com.oopworks.work007.Authentication;
import com.oopworks.work007.User;
import org.junit.Assert;
import org.junit.Test;

public class UserAuthenticationTest {
    @Test
    public void testValidUserLogin() {
        // Define a test user with username and password
        String username = "testuser";
        String password = "TestPassword123";

        // Create a User object with the test credentials
        User user = new User(username, password);

        // Authenticate the user with the provided credentials
        boolean isAuthenticated = Authentication.authenticate(user.getUsername(), user.getPassword());

        // Assert that the authentication result is true
        Assert.assertTrue("Authentication should succeed with valid credentials", isAuthenticated);
    }
}
