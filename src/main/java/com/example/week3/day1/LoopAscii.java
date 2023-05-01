package com.example.week3.day1;

public class LoopAscii {
    public static void main(String[] args) {
        for (int c = 65; c <= 'Z'; c++) {
            System.out.printf("%d:%c ", c, c);
        }
        System.out.println("-------");
        // System.out.printf("%c\n", 222222222); -> utf-16코드 범위 벗어나면 오류
    }
}
