package com.streams;

import java.util.Arrays;
import java.util.List;

public class StringWithSpecificLetter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("String","Of","Greatest","Phenomena","Onion","osho");
         list.stream()
                 .filter((String s)-> s.toLowerCase().startsWith("o"))
                 .forEach(System.out::println);


    }
}
