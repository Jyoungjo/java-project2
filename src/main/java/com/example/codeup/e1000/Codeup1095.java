package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] input = new int[num];
        int minNum = 23;

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if (input[i] < minNum) minNum = input[i];
        }
        System.out.print(minNum);
    }
}
