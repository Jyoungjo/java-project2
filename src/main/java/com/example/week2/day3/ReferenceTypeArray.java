package com.example.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Student();
        students[0].name = "이름";
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 26;

        students[1] = new Student();
        students[1].name = "이름2";
        students[1].phoneNumber = "010-1357-2468";
        students[1].age = 27;
    }
}
