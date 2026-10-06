package com.project.poc_java8_Stream_API.examples.basicstream;

import java.util.Arrays;
import java.util.List;

public class Example10Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int total = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Total: " + total);

        // 10 + 20 + 30 + 40 + 50 - acumulate - 150

        // Using method reference
        int totalNums = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Total: " + totalNums);
    }
}