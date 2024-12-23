package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamUpperCaseLowerCase {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Omraj","RAJESHAWAR","sakha","heyBaby");

          list.stream()
                  .map(String::toLowerCase)
                  .forEach(System.out::println);

          list.stream()
                  .map(String::toUpperCase)
                  .forEach(System.out::println);


    }
}
