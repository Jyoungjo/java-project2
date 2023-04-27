package com.example.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f", numA + numB, numA - numB, numA * numB, numA / numB, numA % numB, (float) numA / numB);
    }
}