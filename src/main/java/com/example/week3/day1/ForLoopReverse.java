package com.example.week3.day1;

public class ForLoopReverse {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}

/*

// 틀린 케이스

public class ForLoopReverseWrong {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i++) {
            System.out.println(i);
        } // 증감식이 ++ 이므로 i 는 무한대로 증가함
    }
}

 */