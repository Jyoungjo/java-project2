package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        int day = 1;

        while (day % numA != 0 || day % numB != 0 || day % numC != 0) {
            day++;
        }
        System.out.print(day);
    }
}
