package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamBasicExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", true),
                new User("Mary", false),
                new User("Robert", true),
                new User("Alice", false),
                new User("Michael", true)
        );

        users.stream()
                .filter(User::isActive) // Predicate
                .map(User::getName) // Function
                .map(String::toUpperCase) // Function
                .forEach(System.out::println);

        // Predicate<User> isActive = u -> u.isActive();
        // Function<User,String> userName = u -> u.getName();
        // Function<User,String> userNameUpperCase = u -> u.getName().toUpperCase();
    }
}

