package com.example.codeup;

import java.util.Scanner;

public class Codeup1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octalNumber = Integer.toOctalString(sc.nextInt());
        System.out.printf("%s", octalNumber);
    }
}