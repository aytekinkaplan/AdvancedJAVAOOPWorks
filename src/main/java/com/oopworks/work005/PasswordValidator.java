package com.oopworks.work005;

public class PasswordValidator {
    public static boolean isValidLength(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        } else if (password.length() > 256) {
            throw new IllegalArgumentException("Password must be less than 256 characters long");
        } else if (password.length() > 128) {
            throw new IllegalArgumentException("Password must be less than 128 characters long");
        } else if (password.length() > 32) {
            throw new IllegalArgumentException("Password must be less than 32 characters long");
        }
        return false;
    }
}
