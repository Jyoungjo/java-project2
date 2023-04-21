package com.example.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User JYJ = new User();
        JYJ.name = "장영조";
        JYJ.phoneNumber = "010-0000-1234";
        JYJ.age = 26;

        System.out.printf("%s님은 성인입니까? %s\n", JYJ.name, JYJ.isAdult());
    }
}
