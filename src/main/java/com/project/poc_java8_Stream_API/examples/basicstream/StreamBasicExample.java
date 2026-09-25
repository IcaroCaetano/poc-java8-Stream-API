package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamBasicExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 34,true),
                new User("Mary", 45,false),
                new User("Robert",32, true),
                new User("Alice", 29,false),
                new User("Michael", 43,true)
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

