package com.example.week4.day1;

public class RightTriangle {
    public static void main(String[] args) {
        int height = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
