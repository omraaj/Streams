package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(21,3,4,67,23,33,89);

        num.stream()
                .forEach(System.out::println);
    }
}
