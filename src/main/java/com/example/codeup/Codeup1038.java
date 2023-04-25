package com.example.codeup;

import java.util.Scanner;

public class Codeup1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sNums = sc.nextLine();
        String[] sArr = sNums.split(" ");
        int num1 = Integer.parseInt(sArr[0]);
        int num2 = Integer.parseInt(sArr[1]);

        System.out.println((long) num1 + num2);
    }
}