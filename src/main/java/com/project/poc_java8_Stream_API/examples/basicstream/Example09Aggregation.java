package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example09Aggregation {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 17, true),
                new User("Mary", 25, true),
                new User("Robert", 16, false),
                new User("Alice", 32, true),
                new User("Michael", 21, true)
        );

        long activeUsers = users.stream()
                .filter(User::isActive)
                .count();

        User youngest = users.stream()
                .min(Comparator.comparing(User::getAge))
                .orElse(null);

        User oldest = users.stream()
                .max(Comparator.comparing(User::getAge))
                .orElse(null);

        System.out.println("Active users: " + activeUsers);
        System.out.println("Youngest: " + youngest.getName());
        System.out.println("Oldest: " + oldest.getName());
    }
}