package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFromList {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Banana","Chickoo","Pomegranete","Papaya");
          fruits.stream()
                  .forEach(System.out::println);
    }
}
