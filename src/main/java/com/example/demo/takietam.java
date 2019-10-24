package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class takietam {

    public static void main(String[] args) {

        String string = "take me to semynak";

        System.out.println(Arrays.stream(string.split(" "))
                .max(Comparator.comparingInt(i -> getStringSum(i))).get());
    }


    public static int getStringSum (String string) {

        String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "q", "r", "s", "t", "w",
                "v", "x", "y", "z"};

       List<Integer> list = new ArrayList<>();
       for (int i = 0; i < string.length(); i++) {
           list.add(Arrays.asList(alphabet).indexOf(string.substring(i, i + 1)) + 1);
       }
       return list.stream().mapToInt(Integer::intValue).sum();
    }
}
