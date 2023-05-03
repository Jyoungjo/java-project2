package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int whatNum = sc.nextInt();
        long[] num = new long[100];

        for (int i = 0; i < whatNum; i++) {
            num[0] = startNum;
            num[i + 1] = num[i] * m + d;
        }
        System.out.print(num[whatNum - 1]);
    }
}
