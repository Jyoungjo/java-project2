package com.example.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sArr = str.split(":");

        int minute = Integer.parseInt(sArr[1]);

        System.out.printf("%d", minute);
    }
}