package com.oopworks.work011;

public class StringWorks {
    public static String stringWorks(String string){

   if(string == null){
       throw new IllegalArgumentException("String cannot be null");
   } else if (string.length()<6) {
       throw new IllegalArgumentException("String must be at least 6 characters long");
   } else if (string.length()>30) {
       throw new IllegalArgumentException("String must be at most 30 characters long");
   }else if (!string.matches("[a-zA-Z0-9]")) {
       throw new IllegalArgumentException("String must only contain letters and numbers");
   }else {
       System.out.println(string);
       System.out.println(string.toUpperCase());
       System.out.println(string.toLowerCase());
       System.out.println(string.length());
       System.out.println(string.charAt(0));
       System.out.println(string.substring(0, 3));
       System.out.println(string.substring(3));
       System.out.println(string.substring(0, 3).toUpperCase());
       System.out.println(string.substring(0, 3).toLowerCase());
       System.out.println(string.substring(3).toUpperCase());
       System.out.println(string.substring(3).toLowerCase());
       System.out.println(string.substring(0, 3) + string.substring(3));
       System.out.println(string.substring(0, 3) + string.substring(3).toUpperCase());
       System.out.println(string.substring(0, 3) + string.substring(3).toLowerCase());
       System.out.println(string.substring(3) + string.substring(0, 3));
       System.out.println(string.substring(3) + string.substring(0, 3).toUpperCase());
       System.out.println(string.substring(3) + string.substring(0, 3).toLowerCase());
       System.out.println(string.substring(0, 3).toUpperCase() + string.substring(3));
       System.out.println(string.substring(0, 3).toLowerCase() + string.substring(3));
       System.out.println(string.substring(3).toUpperCase() + string.substring(0, 3));
       System.out.println(string.substring(3).toLowerCase() + string.substring(0, 3));

   }

        return string;
    }
}
