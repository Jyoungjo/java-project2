package com.example.week4.day2;

public class Pyramid2 {
    private String spaceChar = "0";

    // 생성자 사용하는 이유 - 메소드 내의 기능 분리, 멤버변수를 바꿔주기 위해서 사용
    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    // printPyramidWithSpaceChar 메소드에서 1줄 만드는 기능 분리
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    // * -> #
    public String makeALineSharp(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "#".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }
    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" ");
        Pyramid2 pyramidSpaceZero = new Pyramid2("0");
        pyramid2.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
    }
}
