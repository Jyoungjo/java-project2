package com.example.week4.day3;

public class DrawDiamond {
    public static String getRepeatSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String getRepeatSymbolFor(String symbol, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += symbol;
        }
        return result;
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
                // repeat(): System.out.printf("%s%s\n", getRepeatSymbol(" ", pivot - i), getRepeatSymbol("*", 2 * i + 1));
                System.out.printf("%s%s\n", getRepeatSymbolFor(" ", pivot - i), getRepeatSymbolFor("*", 2 * i + 1));
            } else {
                // repeat(): System.out.printf("%s%s\n", getRepeatSymbol(" ", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
                System.out.printf("%s%s\n", getRepeatSymbolFor(" ", i - pivot), getRepeatSymbolFor("*", 2 * (h - i) - 1));
            }
        }
    }
}
