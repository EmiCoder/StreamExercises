package com.example.demo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenFromBoys {

    public static void main(String[] args) {

        int[] mixed = new int[] {49,818,-282,900,928,281,-282,-1};

        Arrays.stream(menFromBoys(mixed)).forEach(System.out::println);



    }



    public static int[] menFromBoys(final int[] values) {

        List<Integer> listOfMixed = Arrays.stream(values).distinct().boxed().collect(Collectors.toList());

        List<Integer> listOfMen = listOfMixed.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        List<Integer> listOfBoys = listOfMixed.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());

        List<Integer> sortedMen = listOfMen.parallelStream().sorted().collect(Collectors.toList());
        List<Integer> sortedBoys = listOfBoys.parallelStream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> finalList = Stream.of(sortedMen, sortedBoys).flatMap(Collection::stream).collect(Collectors.toList());
        return finalList.stream().mapToInt(i->i).toArray();
    }
}
