package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        long bit = (long) w * h * b;
        float answer = bit / (8.0f * 1024 * 1024);

        System.out.printf("%.2f MB", answer);
    }
}
