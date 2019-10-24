package com.example.demo;

public class CenturyFromYear {

    public static void main(String[] args) {
        System.out.println(century(98));
    }


    public static int century(int number) {
        return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);
    }


}
