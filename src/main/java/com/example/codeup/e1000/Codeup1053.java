package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean printResult = num == 1;

        System.out.println(printResult ? 0 : 1);
    }
}