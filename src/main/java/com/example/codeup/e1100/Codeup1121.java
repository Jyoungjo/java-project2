package com.example.codeup.e1100;

import java.util.Scanner;

public class Codeup1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        System.out.printf("%d", numA % numB);
    }
}
