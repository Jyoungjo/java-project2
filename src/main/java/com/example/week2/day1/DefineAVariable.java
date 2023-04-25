package com.example.week2.day1;

public class DefineAVariable {
    public static void main(String[] args) {
        int num = 10;
        String name = "장영조";
        String name2 = new String("장영조");

        // 모두 다 1이지만 타입이 각각 다름
        String sOne = new String("1");
        int iOne = 1;
        float fOne = 1.0f;

        System.out.printf("String:%s Number:%d Float:%f", sOne, iOne, fOne);
    }
}
