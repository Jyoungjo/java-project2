package com.example.week4.day2;

import java.util.Arrays;

public class SugarSnack {
    private int[][] arr;

    public SugarSnack(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int direction, int x, int y) {
        for (int i = 0; i < l; i++) {
            if(direction == 0) { // 가로
                arr[x - 1][y + i - 1] = 1;
            } else { // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        SugarSnack sugarSnack = new SugarSnack(rowCnt, colCnt);
        sugarSnack.printArr();
        sugarSnack.setBeam(2, 0, 1, 1);
        sugarSnack.printArr();
        sugarSnack.setBeam(3, 1, 2, 3);
        sugarSnack.printArr();
        sugarSnack.setBeam(4, 1, 2, 5);
        sugarSnack.printArr();
    }
}
