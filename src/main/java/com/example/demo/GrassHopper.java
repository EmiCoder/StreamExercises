package com.example.demo;

import java.util.stream.IntStream;

public class GrassHopper {

    public static void main(String[] args) {
        System.out.println(summation(2));
    }

    public static int summation(int n) {
        return IntStream.rangeClosed(1,n).sum();
    }
}
