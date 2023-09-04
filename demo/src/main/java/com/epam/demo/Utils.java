package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        try {
            return args.stream().map(Integer::parseInt).filter(i -> i > 0).count() == args.size();
        } catch (NumberFormatException e) {
            return false;
        }
    }
}