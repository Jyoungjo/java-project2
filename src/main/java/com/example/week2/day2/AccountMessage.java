package com.example.week2.day2;

public class AccountMessage {
    public static void main(String[] args) {
        String name = "이름";
        int balance = 10000;
        String message = name + "님의 통장 잔고는 " + balance + "원입니다.";
        System.out.println(message);

        String result = String.format("%s님의 통장 잔고는 %d원입니다.", name, balance);
        System.out.println(result);
    }
}
