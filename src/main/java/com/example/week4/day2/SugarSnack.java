package com.example.week4.day2;

import java.util.Arrays;
import java.util.Scanner;

public class SugarSnack {
    private int[][] arr;

    public SugarSnack(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int d, int x, int y) {
        for (int i = 0; i < l; i++) {
            if(d == 0) { // 가로
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
        Scanner sc = new Scanner(System.in);
        int rowCnt = sc.nextInt();
        int colCnt = sc.nextInt();
        SugarSnack sugarSnack = new SugarSnack(rowCnt, colCnt);

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sugarSnack.setBeam(l, d, x, y);
        }
        sugarSnack.printArr();
    }
}
