package com.example.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        System.out.printf("%d\n%.1f", numA + numB + numC, (float) (numA + numB + numC) / 3);
    }
}