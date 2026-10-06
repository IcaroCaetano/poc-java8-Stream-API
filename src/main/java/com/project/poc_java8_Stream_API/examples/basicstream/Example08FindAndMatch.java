package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example08FindAndMatch {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 17, true),
                new User("Mary", 25, true),
                new User("Robert", 16, false),
                new User("Alice", 32, true),
                new User("Michael", 21, true)
        );

        // findFirst
        User user = users.stream()
                .filter(User::isActive)
                .findFirst()
                .orElse(null);

        System.out.println(user.getName());

        // findAny
        Optional<User> result = users.stream()
                .filter(User::isActive)
                .findAny();

        System.out.println(result.get().getName() + " - " +
                result.get().getAge() + " - Is Active: " + result.get().isActive());

        // anyMatch
        boolean exists = users.stream()
                .anyMatch(u -> u.getAge() > 30);

        System.out.println("Exists: " + exists);


        // allMatch
        boolean allAdults = users.stream()
                .allMatch(u -> u.getAge() >= 18);

        System.out.println("All adults: " + allAdults);


    }
}