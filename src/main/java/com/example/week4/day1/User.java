package com.example.week4.day1;

public class User {
    private String name;
    private String phoneNumber; // String 쓰는 이유 -> 숫자 맨 앞에 0이 없어져서
    private String password;
    private int age;

    public User() {
    }

    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getPassword() {
        // --> 접근제어 로직
        return password;
    }

    public void setPassword(String password) {
        // --> 본인 확인 로직
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // -> 구체적으로 필요없으면 Getter를 만들지 않음
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAdult() {
        return age >= 18;
    }
}
