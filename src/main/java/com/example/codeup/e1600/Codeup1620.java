package com.example.codeup.e1600;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        boolean isMore = true;
        while (isMore) {
            sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
            if (sum < 10) {
                isMore = false;
            }
        }
        System.out.print(sum);
    }
}
