package com.example.codeup;

import java.util.Scanner;

public class Codeup1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        boolean printResult = numA == numB;

        System.out.println(printResult ? 1 : 0);
    }
}