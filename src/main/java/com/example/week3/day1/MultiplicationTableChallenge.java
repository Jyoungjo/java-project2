package com.example.week3.day1;

public class MultiplicationTableChallenge {
    public static void printDan(int dan) {
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d\n", dan, j, dan * j);
        }
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        printDan(2);
        printDan(4);
        printDan(8);
        printDan(9);
    }
}
