package com.example.codeup.e1200;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // boolean isPrime = true;
        int factors = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // isPrime = false;
                factors++;
                //break;
            }
        }
        // System.out.print(isPrime == true ? "prime" : "not prime");
        System.out.print(factors == 0 ? "prime" : "not prime");
    }
}
