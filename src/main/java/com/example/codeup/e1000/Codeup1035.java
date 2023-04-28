package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.next(), 16);
        String octaNum = Integer.toOctalString(num);
        System.out.printf("%s", octaNum);
    }
}