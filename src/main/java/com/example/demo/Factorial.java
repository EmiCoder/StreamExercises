package com.example.demo;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Useless fuffery!");
        } return n <= 1 ? 1 : n * factorial(n - 1);

    }
}
