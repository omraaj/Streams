package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsSort {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("alice","Bob","Slice","sikka");
        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
