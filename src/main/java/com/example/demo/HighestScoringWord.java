package com.example.demo;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HighestScoringWord {

    public static void main(String[] args) {

        String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "q", "r", "s", "t", "w",
                "v", "x", "y", "z"};

//        System.out.println(Arrays.asList(alphabet).indexOf("c"));

        String something = "bbaa";
        int sum = 0;

//        System.out.println(Arrays.asList(alphabet).indexOf("b"));
//        something.chars().map(n -> {System.out.println(Arrays.asList(alphabet).indexOf(n)); return 0;});
//        System.out.println(intStream);

        String string = "mama ma kota";
//        Arrays.asList(string.split(" ")).stream().max(Comparator.comparingInt(value -> value.chars().)).get();
//        String s = Arrays.asList(string.split(" ")).stream().max(Comparator.comparingInt(value -> ));
//        Integer integer = list.stream().max(Comparator.comparingInt(Integer::byteValue)).get();
//        System.out.println(s);
//        System.out.println(s);

//        String s = "mama ma kota";
        System.out.println(Arrays.stream(string.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get());
//        System.out.println(high("mamahgtd"));
    }

    public static String high(String s) {

        String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "q", "r", "s", "t", "w",
                "v", "x", "y", "z"};

        String[] splitted = s.split(" ");
        List<Integer> allSizes = new ArrayList<>();

        for (String string : splitted) {
            int value = 0;
            for (int i = 0; i < string.length(); i++) {
                value += Arrays.asList(alphabet).indexOf(String.valueOf(string.charAt(i))) + 1;
            }
            allSizes.add(value);
        }

        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < allSizes.size(); i++) {
            if (allSizes.get(i) > max) {
                max = allSizes.get(i);
                indexOfMax = i;
            }
        }
        return splitted[indexOfMax];
    }
}


