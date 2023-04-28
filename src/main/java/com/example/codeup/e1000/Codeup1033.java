package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexaDecimalNumber = Integer.toHexString(sc.nextInt());
        System.out.printf("%s", hexaDecimalNumber.toUpperCase());
    }
}