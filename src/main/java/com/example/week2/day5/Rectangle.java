package com.example.week2.day5;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        for (int i = 0; i < val2; i++) {
            for (int j = 0; j < val1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
