package com.example.demo;

import java.math.BigInteger;
import java.util.stream.Stream;

public class LargeSum {

    public static void main(String[] args) {
        String[] number = { "37107287533902102798797998220837590246510135740250",
                "46376937677490009712648124896970078050417018260538",
                "74324986199524741059474233309513058123726617309629",
                "91942213363574161572522430563301811072406154908250",
                "23067588207539346171171980310421047513778063246676",
                "89261670696623633820136378418383684178734361726757",
                "28112879812849979408065481931592621691275889832738",
                "44274228917432520321923589422876796487670272189318",
                "47451445736001306439091167216856844588711603153276",};

        System.out.println(firstTenDigitsOfSum(number));

    }

    public static String firstTenDigitsOfSum(String[] numbers) {
        return Stream.of(numbers).map(BigInteger::new).reduce(BigInteger::add).get().toString().substring(0,10);
    }
}
