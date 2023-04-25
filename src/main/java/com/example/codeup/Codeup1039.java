package com.example.codeup;

import java.util.Scanner;

public class Codeup1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sNums = sc.nextLine();
        String[] sArr = sNums.split(" ");
        long num1 = Long.parseLong(sArr[0]);
        long num2 = Long.parseLong(sArr[1]);

        System.out.printf("%d", num1 + num2);
    }
}