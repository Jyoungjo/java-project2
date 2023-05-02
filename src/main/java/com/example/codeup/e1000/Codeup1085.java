package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        long bit = (long) h * b * c * s;
        float answer = (float) bit / (8 * 1024 * 1024);

        System.out.printf("%.1f MB", answer);
    }
}
