package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= iVal; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
