package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDistinct {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,3,6,4,56,34);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
