package com.example.codeup;

import java.util.Scanner;

public class Codeup1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        if (numA % 2 == 0) {
            System.out.printf("%s\n", "even");
        } else {
            System.out.printf("%s\n", "odd");
        }
        if (numB % 2 == 0) {
            System.out.printf("%s\n", "even");
        } else {
            System.out.printf("%s\n", "odd");
        }
        if (numC % 2 == 0) {
            System.out.printf("%s\n", "even");
        } else {
            System.out.printf("%s\n", "odd");
        }
    }
}