package com.example.week5.day2;

import java.util.Arrays;

public class InsertionSort02 {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort02 is2 = new InsertionSort02();
        arr = is2.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
