package com.example.week4.day1;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.age = 37;
        return user;
    }
}
