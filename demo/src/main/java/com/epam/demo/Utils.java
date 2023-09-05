package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        try {
            return args.stream().filter(StringUtils::isPositiveNumber).count() == args.size();
        } catch (NumberFormatException e) {
            return false;
        }
    }
}