package com.example.demo;

import java.util.*;

public class SumOdOddNumbers {

    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(3));
    }

    public static int rowSumOddNumbers(int n) {
        Map<Integer, List<Integer>> integerListMap = generateMapOfOddNumbers(n);
        return integerListMap.get(n).parallelStream().mapToInt(Integer::intValue).sum();
    }

    public static Map<Integer, List<Integer>> generateMapOfOddNumbers (int amountOfRows) {

        Map<Integer, List<Integer>> map = new TreeMap<>();

        int key = 1;
        int tmp = 1;
        for (int i = 0; i < amountOfRows; i++) {
            List<Integer> tmpList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                tmpList.add(tmp);
                tmp += 2;
            }
            map.put(key,tmpList);
            key++;
        }
        return map;
    }


}
