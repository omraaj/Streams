package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,5,12,23,222,87);
        int sum =numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("Sum "+sum);
    }
}
