package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExercises {

    public static void main(String[] args) {
    }

    public static Integer fibonacci(Integer n) {
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                                                    .limit(n).map(x -> x[0])
                                                    .reduce((a, b) -> b).orElse(-1);
    }

    public static Boolean isPrime(Integer n) {
        return n > 1 && IntStream.range(2, n).noneMatch(x -> n % x == 0);
    }

    public static List<String> bizzBuzzBis(Integer i) {
        return Stream.iterate(1, n -> n + 1)
                .limit(i)
                .map(x -> {
                            if (x % 3 == 0 && x % 5 == 0) {
                                return "BizzBuzz";
                            } else if (x % 3 == 0) {
                                return "Bizz";
                            } else if (x % 5 == 0) {
                                return "Buzz";
                            } else {
                                return String.valueOf(x);
                            }
                        }
                ).collect(Collectors.toList());
    }

    public static void fizzBuzz(Integer i) {
        Stream.iterate(1, n -> n + 1)
                .limit(i)
                .forEach(x -> {
                            if (x % 3 == 0 && x % 5 == 0) {
                                System.out.println("BizzBuzz");
                            } else if (x % 3 == 0) {
                                System.out.println("Bizz");
                            } else if (x % 5 == 0) {
                                System.out.println("Buzz");
                            } else {
                                System.out.println(x);
                            }
                        }
                );
    }

    public static Integer getElement(List<Integer> list, Integer x) {
        return IntStream.range(0, list.size())
                                .filter(i -> i == x)
                                .mapToObj(list::get)
                                .findFirst().orElse(-1);
    }

    public static Integer sum(Integer i) {
        return Stream.iterate(1, n -> n + 1)
                            .limit(i)
                            .filter(x -> (x % 3 == 0) || (x % 5 == 0))
                            .mapToInt(Integer::intValue)
                            .sum();
    }

    public static Integer factorial(Integer i) {
        return IntStream.rangeClosed(1, i)
                            .reduce(1, (a, b) -> a * b);
    }

    public static int search(Integer n, Integer[] list) {

            return IntStream.range(0, list.length)
                                .filter(i -> list[i] == n)
                                .findFirst().orElse(-1);
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static Integer maximum(Integer[] list) {
        return Arrays.stream(list).max(Comparator.naturalOrder()).get();
    }

    public static Double average(List<Integer> list) {
        return list.stream().mapToDouble(a -> a).average().getAsDouble();
    }

    public static List<String> upperCase(List<String> list) {
        return list.stream().map(String::toString).collect(Collectors.toList());
    }


}
