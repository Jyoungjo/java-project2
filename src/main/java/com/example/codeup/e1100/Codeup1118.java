package com.example.codeup.e1100;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        System.out.printf("%.1f", (float) numA * numB / 2);
    }
}
