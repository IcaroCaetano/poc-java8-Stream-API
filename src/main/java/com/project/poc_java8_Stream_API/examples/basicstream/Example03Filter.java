package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.List;

public class Example03Filter {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 17, true),
                new User("Mary", 25, true),
                new User("Robert", 16, true),
                new User("Alice", 32, false),
                new User("Michael", 21, true)
        );

        users.stream()
                .filter(user -> user.getAge() >= 18) // predicate<User>
                .forEach(user -> System.out.println(user.getName()));
    }
}