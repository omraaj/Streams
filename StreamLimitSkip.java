package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLimitSkip {

    public static void main(String[] args) {
        Stream<Integer> num = Stream.iterate(1,n->n+1);
                                 num.skip(5)
                                         .limit(5)
                                         .forEach(System.out::println);




    }
}
