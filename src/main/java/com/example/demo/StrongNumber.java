package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StrongNumber {

    public static void main(String[] args) {
        System.out.println(isStrongNumber(185));
    }

    public static String isStrongNumber(int num) {
        String string = String.valueOf(num);
        List<String> listOfSingleNumbers = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            listOfSingleNumbers.add(String.valueOf(string.charAt(i)));
        }
        int sum = listOfSingleNumbers.stream().mapToInt(i -> Integer.parseInt(i)).map(i -> getStrong(i)).sum();

        return (sum == num) ? "STRONG!!!!" : "Not Strong !!";
    }

    public static int getStrong (int i) {
        int number = 1;
        for (int a = 1; a <= i; a++) {
            number *= a;
        }
        return number;
    }
}
