package com.example.week1.day5;

import com.example.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 1;
    public static void main(String[] args) {
        final int iVal = 1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();
    }
}
