package com.example.codeup;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        boolean printResult = numA == 0 && numB == 0;

        System.out.println(printResult ? 1 : 0);
    }
}