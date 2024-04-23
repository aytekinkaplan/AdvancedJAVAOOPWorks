package com.oopworks.work007;

public class Authentication {
    // Constants for username and password length limits
    private static final int MIN_USERNAME_LENGTH = 8;
    private static final int MAX_USERNAME_LENGTH = 32;
    private static final int MIN_PASSWORD_LENGTH = 8;

    public static boolean authenticate(String username, String password) {
        // Null check for username and password
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username and password cannot be null");
        }

        // Username length validation
        if (username.length() < MIN_USERNAME_LENGTH || username.length() > MAX_USERNAME_LENGTH) {
            throw new IllegalArgumentException("Username length must be between " + MIN_USERNAME_LENGTH +
                    " and " + MAX_USERNAME_LENGTH + " characters long");
        }

        // Password length validation
        if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new IllegalArgumentException("Password must be at least " + MIN_PASSWORD_LENGTH + " characters long");
        }

        // Password complexity validation - This part can be added optionally

        return true; // Authentication is successful when all conditions are met
    }
}
