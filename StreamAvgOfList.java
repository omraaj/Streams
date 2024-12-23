package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamAvgOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,8,3,5,23);
  long count = list.stream()
          .count();


  int sum=list.stream()
          .reduce(0,(Integer::sum));

  double avg =sum/count;
        System.out.println(avg);

    }
}
