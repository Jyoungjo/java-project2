package com.example.codeup.e1100;

import java.util.Scanner;

public class Codeup1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        System.out.printf("%d %d", seconds / 60, seconds % 60);
    }
}
