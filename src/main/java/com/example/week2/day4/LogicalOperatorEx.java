package com.example.week2.day4;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;

        if (age >= 18 && !isStudent) {
            System.out.println("성인이며 학생이 아닙니다.");
        }

        boolean result = true && true;
        System.out.printf("%b\n", result);
        result = true && false;
        System.out.printf("%b\n", result);
        result = false && true;
        System.out.printf("%b\n", result);
        result = false && false;
        System.out.printf("%b\n", result);
    }
}
