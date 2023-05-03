package com.example.week3.day3;

public class Factor {
    public static void main(String[] args) {
        int num = 36;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
