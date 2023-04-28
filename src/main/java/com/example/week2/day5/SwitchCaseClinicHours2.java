package com.example.week2.day5;

import java.util.Scanner;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        String time = " ";

        switch (day) {
            case "월", "화", "수", "목", "금": time = "09:00-19:00"; break;
            case "토": time = "09:00-14:00"; break;
            case "일": time = "휴진"; break;
        }
        System.out.printf("가X병원의 %s요일 진료시간은 %s입니다.", day, time);
    }
}
