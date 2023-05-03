package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", input[num - 1 - i]);
        }
    }
}
