package com.example.week4.day1;

public class User {
    String name;
    String phoneNumber; // String 쓰는 이유 -> 숫자 맨 앞에 0이 없어져서
    int age;

    boolean isAdult() {
        return age >= 18;
    }
}
