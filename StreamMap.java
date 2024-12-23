package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamMap {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omraj","Girish","Sakharam");
        names.stream()
//    with lambda expressions             .map((String s)->s.toLowerCase())
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
