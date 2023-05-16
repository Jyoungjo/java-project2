package com.example.week5.day2;

import java.util.Arrays;

public class InsertionSort03 {
    // desc --> 내림차순
    // asc --> 오름차순
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                if (isAscending ? arr[j] < arr[j - 1] : arr[j - 1] < arr[j]) {
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
    public int[] sort(int[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort03 is2 = new InsertionSort03();
        arr = is2.sort(arr, false);
        System.out.print(Arrays.toString(arr));
    }
}
