package com.example.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort02 {
    // 버블정렬 OOP
    Comparator<Integer> comparator;

    public BubbleSort02(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortAscendingOrderARound(int[] arr, int until) {
        for (int j = 0; j < until; j++) {
            if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sortDescendingOrderARound(int[] arr, int until) {
        for (int j = 0; j < until; j++) {
            if (comparator.compare(arr[j], arr[j + 1]) < 0) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sortAscendingOrder(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            arr = sortAscendingOrderARound(arr, arr.length - i);
        }
        return arr;
    }

    public int[] sortDescendingOrder(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            arr = sortDescendingOrderARound(arr, arr.length - i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int[] arr = {7, 2, 3, 9, 28, 1};

        arr = bubbleSort02.sortAscendingOrder(arr);
        System.out.println(Arrays.toString(arr));

        arr = bubbleSort02.sortDescendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
