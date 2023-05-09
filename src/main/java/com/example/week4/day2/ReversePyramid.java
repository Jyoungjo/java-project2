package com.example.week4.day2;

public class ReversePyramid {
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0";

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h + 3 - (i * 2)));
    }

    /*
    public String makeParallelogramALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }
    */

    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.printf(reversePyramid.makeALine(h, i));
        }
    }
}
