package com.streams;

import java.util.Arrays;
import java.util.List;

public class STreamAvgOfnums {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,8,23,21,89);

        double avg = list.stream()
                        .mapToDouble(Integer::doubleValue)
                                .average()
                                        .orElse(0.0);


        System.out.println(avg);
    }
}
