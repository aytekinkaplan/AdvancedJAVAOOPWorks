package com.oopworks.work012.Variables;

public class Task001 {
    public static String stringWorks01(String string) {

        return string;
    }

    public static String stringWorks02(String string) {

        return string.length() >= 5 ? "The string is long enough" : "The string is too short";
    }

    public static String stringWorks03(String string) {

        return string.toUpperCase();
    }

    public static String stringWorks04(String string) {

        return string.toLowerCase();
    }

    public static String stringWorks05(String string) {
        // String'in uzunluğunu kontrol eder ve ters çevirir
        return new StringBuilder(string).reverse().toString();
    }

    public static String stringWorks06(String string) {
        // String'in uzunluğunu kontrol eder ve ilk harfini büyük yapar
        return string.length() > 0 ? Character.toUpperCase(string.charAt(0)) + string.substring(1) : "";
    }

    public static String stringWorks07(String string) {
        // String'in uzunluğunu kontrol eder ve son harfini alır
        return string.length() > 0 ? string.substring(string.length() - 1) : "";
    }

    public static String stringWorks08(String string) {
        // String'in uzunluğunu kontrol eder ve içindeki boşlukları temizler
        return string.trim();
    }

    public static String stringWorks09(String string) {
        // String'in uzunluğunu kontrol eder ve boşlukları "-" ile değiştirir
        return string.replaceAll("\\s", "-");
    }

    public static String stringWorks10(String string) {
        // String'in uzunluğunu kontrol eder ve her karakterin ASCII değerini döndürür
        StringBuilder builder = new StringBuilder();
        for (char c : string.toCharArray()) {
            builder.append((int) c).append(" ");
        }
        return builder.toString();
    }

    public static String stringWorks11(String string) {
        // String'in uzunluğunu kontrol eder ve sadece rakam ve harf karakterlerini tutar
        return string.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String stringWorks12(String string) {
        // String'in uzunluğunu kontrol eder ve kelime sayısını döndürür
        String[] words = string.trim().split("\\s+");
        return String.valueOf(words.length);
    }

    public static String stringWorks13(String string) {
        // String'in uzunluğunu kontrol eder ve her kelimenin ilk harfini büyük yapar
        String[] words = string.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return result.toString().trim();
    }

    public static String stringWorks14(String string) {
        // String'in uzunluğunu kontrol eder ve boşluğa göre kelimeleri ayırır, her kelimeyi ters çevirir ve sonuçları birleştirir
        String[] words = string.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

}
