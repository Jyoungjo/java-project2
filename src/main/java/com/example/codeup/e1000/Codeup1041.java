package com.example.codeup.e1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char cVal = (char) (br.readLine().charAt(0) + 1);

        System.out.printf("%c", cVal);
    }
}