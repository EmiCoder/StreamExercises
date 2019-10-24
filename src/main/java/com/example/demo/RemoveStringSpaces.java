package com.example.demo;

public class RemoveStringSpaces {

    public static void main(String[] args) {
        System.out.println(noSpace("hgkg hhgfhg     gfgfd "));
    }

    static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}
