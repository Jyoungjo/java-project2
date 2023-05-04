package com.example.codeup.e4500;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int maxVal = 0;
        int row = 0;
        int col = 0;

        // 시간복잡도 O(N^2)
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (maxVal < arr[i][j]) {
                    maxVal = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.printf("%d\n%d %d", maxVal, row, col);
    }
}
