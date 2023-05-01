package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cVal = sc.next().charAt(0);

        for (char c = 'a'; c <= cVal; c++) {
            System.out.printf("%c ", c);
        }
    }
}
