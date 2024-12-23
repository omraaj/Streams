package com.streams;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(22,22,33,44,76,43,21,43);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
