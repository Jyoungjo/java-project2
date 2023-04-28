package com.example.codeup.e1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1124 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String molecule = br.readLine().substring(1);
        String[] moleculeArr = molecule.split("H");
        int x = Integer.parseInt(moleculeArr[0]);
        int y = Integer.parseInt(moleculeArr[1]);

        System.out.printf("%d", 12 * x + y);
    }
}
