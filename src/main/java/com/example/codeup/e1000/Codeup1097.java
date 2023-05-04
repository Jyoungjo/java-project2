package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] badukPlate = new int[20][20];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                badukPlate[i][j] = sc.nextInt();
            }
        }
        int reverseCnt = sc.nextInt();
        for (int i = 0; i < reverseCnt; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 가로 바꾸기
            for (int j = 0; j < 20; j++) {
                if (badukPlate[x - 1][j] == 0) {
                    badukPlate[x - 1][j] = 1;
                } else {
                    badukPlate[x - 1][j] = 0;
                }
            }
            // 세로 바꾸기
            for (int j = 0; j < 20; j++) {
                if (badukPlate[j][y - 1] == 0) {
                    badukPlate[j][y - 1] = 1;
                } else {
                    badukPlate[j][y - 1] = 0;
                }
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", badukPlate[i][j]);
            }
            System.out.println();
        }
    }
}
