package com.example.week4.day3;

public class DiamondShapeDrawer2 extends ShapeDrawer2{
    @Override
    public String makeALine(int height, int i) {
        int pivot = height / 2;

        if (i - 1 <= pivot) {
            return String.format("%s%s\n", "0".repeat(pivot - (i - 1)), "*".repeat(2 * (i - 1) + 1));
        } else {
            return String.format("%s%s\n", "0".repeat(i - 1 - pivot), "*".repeat(2 * (height - (i - 1)) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer2 diamond = new DiamondShapeDrawer2();
        diamond.printShape(7);
    }
}
