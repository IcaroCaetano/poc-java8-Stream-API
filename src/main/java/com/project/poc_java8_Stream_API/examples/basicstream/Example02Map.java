package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.List;

public class Example02Map {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 25, true),
                new User("Mary", 32, true),
                new User("Robert", 40, false),
                new User("Alice", 28, true)
        );

        users.stream()
                .map(User::getName)// Function<User,String>
                .forEach(System.out::println);
    }
}