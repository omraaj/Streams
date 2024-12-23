package com.streams;


import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithFiles {

    public static void main(String[] args) throws FileNotFoundException {
        try(Stream<String>lines= Files.lines(Paths.get("C:\\Users\\LENOVO\\Downloads\\example.txt"))){
  lines.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
