package com.example.week5.day1;

import java.util.Arrays;

public class BubbleSort2 {
    public boolean isAscendingOrder(int num) {
        if (num == 1) return false;
        return true;
    }

    public int[] sort(int[] arr, int num) {
        if (isAscendingOrder(num)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            } return arr;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            } return arr;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        BubbleSort2 bubbleSort2 = new BubbleSort2();

        arr = bubbleSort2.sort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
