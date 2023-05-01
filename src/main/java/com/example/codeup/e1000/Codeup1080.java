package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int sum = 0;
        for (int i = 1; sum <= inputNum; i++) {
            sum += i;
            if (sum >= inputNum) {
                System.out.println(i);
                break;
            }
        }
    }
}
