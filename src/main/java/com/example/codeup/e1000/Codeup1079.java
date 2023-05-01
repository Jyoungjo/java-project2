package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (char c = 0; c < 'Z'; c++) {
            char cVal = sc.next().charAt(0);
            System.out.println(cVal);
            if (cVal == 'q') {
                break;
            }
        }
    }
}
