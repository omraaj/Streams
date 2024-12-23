package com.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,3,4,5,6,21,32,11,45);
        num.parallelStream()
                .forEach(System.out::println);
    }
}
