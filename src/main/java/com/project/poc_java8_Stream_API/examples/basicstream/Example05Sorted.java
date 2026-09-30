package com.project.poc_java8_Stream_API.examples.basicstream;

import com.project.poc_java8_Stream_API.model.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example05Sorted {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Michael", 21, true),
                new User("John", 17, true),
                new User("Alice", 32, true),
                new User("Robert", 16, false),
                new User("Mary", 25, true)
        );

        users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .sorted()
                .forEach(System.out::println);

        /**
         * Alice
         * John
         * Mary
         * Michael
         */

        System.out.println();

        users.stream()
                .filter(User::isActive)
                .sorted((user1, user2) ->
                        Integer.compare(user1.getAge(), user2.getAge()))
                .forEach(user ->
                        System.out.println(user.getName() + " - " + user.getAge()));

        /**
         * John - 17
         * Michael - 21
         * Mary - 25
         * Alice - 32
         */

        System.out.println();

        users.stream()
                .filter(User::isActive)
                .sorted(Comparator.comparing(User::getAge))
                .forEach(user -> System.out.println(
                        user.getName() + " - " + user.getAge()));
    }
}