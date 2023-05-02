package com.example.week3.day2;

public class SpecialTwoDimensionalArray1 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }
        return answer;
    }
}
