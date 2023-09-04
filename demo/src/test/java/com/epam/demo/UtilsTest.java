package com.epam.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        List<String> numbers = IntStream.rangeClosed(-10, 10).boxed().map(String::valueOf).collect(Collectors.toList());
        boolean expected = false;
        boolean actual = Utils.isAllPositiveNumbers(numbers);

        Assertions.assertEquals(expected, actual);
    }
}
