package com.example.codeup.e1200;

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= num * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
