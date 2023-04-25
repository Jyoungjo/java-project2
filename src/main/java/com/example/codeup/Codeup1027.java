package com.example.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sArr = str.split("\\.");

        int year = Integer.parseInt(sArr[0]);
        int month = Integer.parseInt(sArr[1]);
        int day = Integer.parseInt(sArr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}