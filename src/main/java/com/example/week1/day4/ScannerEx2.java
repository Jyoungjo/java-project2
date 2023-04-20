package com.example.week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
    public void inputTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요. 입력하고 엔터");
        System.out.print("첫 번째 숫자는 : ");
        System.out.println("첫 번째 숫자는 " + sc.nextInt() + " 입니다.");
        System.out.print("두 번째 숫자는 : ");
        System.out.println("두 번째 숫자는 " + sc.nextInt() + " 입니다.");
    }
}
