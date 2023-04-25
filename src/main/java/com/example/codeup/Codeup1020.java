package com.example.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userId = sc.nextLine();

        String frontId = userId.substring(0, 6);
        String backId = userId.substring(7, 14);

        System.out.printf("%s%s", frontId, backId);
    }
}

/*

        // 다른 풀이

        Scanner sc = new Scanner(System.in);
        String userId = sc.nextLine().replace("-", "");

        System.out.printf("%s", userId);

 */