package com.streams;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple","Banana","Cherry");
        stream.forEach(System.out::println);
    }
}
