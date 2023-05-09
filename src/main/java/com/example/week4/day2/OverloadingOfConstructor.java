package com.example.week4.day2;

public class OverloadingOfConstructor {
    private int[][] arr;
    private boolean printSeparator;

    public OverloadingOfConstructor() {
        this.arr = new int[5][5];
        this.printSeparator = true;
    }

    public OverloadingOfConstructor(boolean printSeparator) {
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
        // Class의 printSeparator = Parameter의 printSeparator
    }

    public OverloadingOfConstructor(int rowCnt){
        this.arr = new int[rowCnt][5];
    }

    public OverloadingOfConstructor(int rowCnt, int colCnt){
        this.arr = new int[rowCnt][colCnt];
    }
}
