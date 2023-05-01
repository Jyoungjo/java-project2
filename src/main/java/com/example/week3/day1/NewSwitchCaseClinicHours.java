package com.example.week3.day1;

public class NewSwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "월";
        String time = switch (day) {
            case "월", "화", "목", "금" -> "09:30-18:30";
            case "토" -> "09:30-13:30";
            case "수", "일" -> "휴진";
            default -> throw new IllegalArgumentException("해당 요일:" + day);
        };
        System.out.printf("%s요일 진료시간은 %s입니다.", day, time);
    }
}
