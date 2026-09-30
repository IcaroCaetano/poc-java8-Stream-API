package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example07LimitSkip {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 17, true),
                new User("Mary", 25, true),
                new User("Robert", 16, true),
                new User("Alice", 32, true),
                new User("Michael", 21, true),
                new User("David", 40, true),
                new User("Sarah", 28, true)
        );

        users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .skip(3) // skip exclusivo a partir do terceiro elemento
                .limit(3)
                .forEach(user ->
                        System.out.println(user.getName() + " - " + user.getAge()));
    }

    /**
     * Mary - 25
     * Sarah - 28
     * Alice - 32
     */
}