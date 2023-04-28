package com.example.codeup.e1100;

import java.util.Scanner;

public class Codeup1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celciusDegree = sc.nextInt();

        System.out.printf("%.3f", (float) 9 / 5 * celciusDegree + 32);
    }
}
