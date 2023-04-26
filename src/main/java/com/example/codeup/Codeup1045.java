package com.example.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f", a + b, a - b, a * b, a / b, a % b, (float) a / b);
    }
}