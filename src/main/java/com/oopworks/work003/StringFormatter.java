package com.oopworks.work003;

public class StringFormatter {
    public static String toUpper(String str) {
        return str.toUpperCase();
    }
    public static String toLower(String str) {
        return str.toLowerCase();
    }
    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public static String uncapitalize(String str) {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String trim(String str) {
        return str.trim();
    }
    public static String repeat(String str, int n) {
        return str.repeat(n);
    }
    public static String substring(String str, int start, int end) {
        return str.substring(start, end);
    }
    public static String substring(String str, int start) {
        return str.substring(start);
    }

}
