package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] badukPlate = new int[20][20];
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            badukPlate[x][y] = 1;
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", badukPlate[i][j]);
            }
            System.out.println();
        }
    }
}
