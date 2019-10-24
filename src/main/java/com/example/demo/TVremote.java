package com.example.demo;
import java.util.Arrays;

public class TVremote {

    public static void main(String[] args) {
        System.out.println((double) 1907/100);
//        System.out.println(getAmountOfPresses("work"));
    }

    public static int getAmountOfPresses (String string) {

        String[] marks = new String[] {"a", "b", "c", "d", "e", "1", "2", "3", "f", "g", "h", "i", "j", "4", "5", "6",
                "k", "l", "m", "n", "o", "7", "8", "9", "p", "q", "r", "s", "t", ".", "@", "0",
                "u", "v", "w", "x", "y", "z", "_", "/"};

        int amountOfPresses = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (i == 0) {
                amountOfPresses += countPresses(0,0, row(String.valueOf(string.charAt(i)), marks), column(String.valueOf(string.charAt(i)), marks));
            }
                String actual = String.valueOf(string.charAt(i));
                String next = String.valueOf(string.charAt(i + 1));
                int actualRow = row(actual, marks);
                int actualColumn = column(actual, marks);
                int nextRow = row(next, marks);
                int nextColumn = column(next, marks);
                amountOfPresses += countPresses(actualRow, actualColumn, nextRow, nextColumn);
            }
        return amountOfPresses;
    }

    public static int countPresses (int actualRow, int actualColumn, int nextRow, int nextColumn) {

        if (actualRow >= nextRow) {
            if (actualColumn >= nextColumn) {
                return (actualRow - nextRow) + (actualColumn - nextColumn) + 1;
            } else {
                return (actualRow - nextRow) + (nextColumn - actualColumn) + 1;
            }
        } else {
            if (actualColumn >= nextColumn) {
                return (nextRow - actualRow) + (actualColumn - nextColumn) + 1;
            } else {
                return (nextRow - actualRow) + (nextColumn - actualColumn) + 1;
            }
        }
    }


    public static int row (String mark, String[] marks) {
        int index = Arrays.asList(marks).indexOf(mark);

            if (index <= 7) {
                return 0;
            }
            if (index > 7 && index <= 15) {
                return 1;
            }
            if (index > 15 && index <= 23) {
                return 2;
            }
            if (index > 23 && index <= 31) {
                return 3;
            } else {
                return 4;
            }
    }

    public static int column (String mark, String[] marks) {
        int index = Arrays.asList(marks).indexOf(mark);
        return index % 8;
    }
}
