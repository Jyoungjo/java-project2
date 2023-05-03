package com.example.week3.day3;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 687;

        // method 안 쓰고 작성
        String flagText = "0또는 5로만 이루어진 숫자입니다.";
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0) {
                flagText = "0또는 5로만 이루어진 숫자가 아닙니다.";
                break;
            }
            num /= 10;
        }
        System.out.println(flagText);
    }
}
