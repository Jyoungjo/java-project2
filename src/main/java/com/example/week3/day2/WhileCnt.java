package com.example.week3.day2;

public class WhileCnt {
    public static void main(String[] args) throws InterruptedException {
        int cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt); // 10까지 반복하고 출력
            cnt++;
        }
        System.out.println("cnt = " + cnt); // 11까지 완료되고 출력
    }
}
