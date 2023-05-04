package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int cntOfStick = sc.nextInt();
        int[][] plate = new int[width + 1][height + 1];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                plate[i][j] = 0;
            }
        }

        for (int i = 0; i < cntOfStick; i++) {
            int lengthOfStick = sc.nextInt();
            int directionOfStick = sc.nextInt();
            int xOfStick = sc.nextInt();
            int yOfStick = sc.nextInt();

            plate[xOfStick][yOfStick] = 1;
            for (int j = 1; j < lengthOfStick; j++) {
                if (directionOfStick == 0) {
                    plate[xOfStick][yOfStick + j] = 1;
                } else if (directionOfStick == 1) {
                    plate[xOfStick + j][yOfStick] = 1;
                }
            }
        }
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.printf("%d ", plate[i][j]);
            }
            System.out.println();
        }
    }
}
