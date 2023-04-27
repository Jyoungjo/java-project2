package com.example.codeup;

import java.util.Scanner;

public class Codeup1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        System.out.println(numB >= numA ? 1 : 0);
    }
}