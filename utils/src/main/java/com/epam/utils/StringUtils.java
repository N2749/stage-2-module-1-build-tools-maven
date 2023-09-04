package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        try {
            return Integer.parseInt(str) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
