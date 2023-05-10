package com.example.week4.day3;

public class DrawDiamond2 {
    public static String getRepeatSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String makeALine(int height, int i) {
        int pivot = height / 2;

        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatSymbol(" ", pivot - i), getRepeatSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatSymbol(" ", i - pivot), getRepeatSymbol("*", 2 * (height - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h = 7;

        for (int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
}
