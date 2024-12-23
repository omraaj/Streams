package com.streams;

import java.util.Arrays;
import java.util.List;

public class NumberSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,23,54,22,32,33);

        int sumOfevens=list.stream()
                .filter(num->num%2==0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers:"+sumOfevens);

        int sumOfodds=list.stream()
                .filter(num->num%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Odd numbers:"+sumOfodds);

    }

}
