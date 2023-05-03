package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] input = new int[num];
        int[] cnt = new int[24];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
            cnt[input[i]]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            System.out.printf("%d ", cnt[i]);
        }
    }
}
