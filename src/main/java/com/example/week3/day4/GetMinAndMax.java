package com.example.week3.day4;

public class GetMinAndMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        //최대값 구하기
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            // maxValue < arr[i] 일 때, 교체
            if (maxValue < arr[i]) maxValue = arr[i];
        }
        System.out.println("maxValue = " + maxValue);

        // 최소값 구하기
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // minValue > arr[i] 일 때, 교체
            if (minValue > arr[i]) minValue = arr[i];
        }
        System.out.println("minValue = " + minValue);
    }
}
