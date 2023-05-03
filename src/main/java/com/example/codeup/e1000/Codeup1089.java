package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[150];
        int startNum = sc.nextInt();
        int d = sc.nextInt();
        int whatNum = sc.nextInt();

        for (int i = 0; i < whatNum; i++) {
            num[0] = startNum;
            num[i + 1] = num[i] + d;
        }
        System.out.print(num[whatNum - 1]);
    }
}
