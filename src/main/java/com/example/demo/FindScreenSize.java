package com.example.demo;

public class FindScreenSize {

    public static void main(String[] args) {
        System.out.println(findScreenHeight(2123,"4:3"));
    }

    public static String findScreenHeight(int width, String ratio) {
        double liczba = (double) width / Integer.parseInt(ratio.split(":")[0])
                                        * Integer.parseInt(ratio.split(":")[1]);
        return width + "x" + String.valueOf((int) liczba);
    }

}
