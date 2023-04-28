package com.example.codeup.e1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sArr = str.split("\\.");

        System.out.printf("%s\n%s", sArr[0], sArr[1]);
    }
}