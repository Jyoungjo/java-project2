package com.example.week3.day3;

public class IsPrimeDivide {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0;
        for (int i = 2; i <= num / 2; i++) { // 1 ~ 6 까지
            if (num % i == 0) factors++;
        }
        System.out.printf("factors:%d\n", factors);
        System.out.print(factors == 0 ? num + "은 소수입니다.": num + "은 소수가 아닙니다.");
    }
}
