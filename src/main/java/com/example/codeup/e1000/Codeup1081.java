package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        for (int i = 1; i <= numA; i++) {
            for (int j = 1; j <= numB; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
