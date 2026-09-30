package com.project.poc_java8_Stream_API.examples.basicstream;

import java.util.Arrays;
import java.util.List;

public class Example06Distinct {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "John",
                "Mary",
                "John",
                "Alice",
                "Mary",
                "Michael",
                "Alice"
        );

        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}