package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();

        if (numA % 2 == 0) {
            if (numA > 0) {
                System.out.printf("%s\n%s", "plus", "even");
            } else {
                System.out.printf("%s\n%s", "minus", "even");
            }
        } else {
            if (numA > 0) {
                System.out.printf("%s\n%s", "plus", "odd");
            } else {
                System.out.printf("%s\n%s", "minus", "odd");
            }
        }
    }
}