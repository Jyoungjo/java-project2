package com.example.codeup;

import java.util.Scanner;

public class Codeup1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexaDecimalNumber = Integer.toHexString(sc.nextInt());
        System.out.printf("%s", hexaDecimalNumber);
    }
}