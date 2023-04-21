package com.example.week1.day5;

public class SpaceInvaderMemberVariableTest {
    int location; // 멤버 변수
    public final int MAX_LEVEL = 3; // 상수의 멤버 변수

    public void moveLeft() {
        location = location - 1;
    }

    public void moveLeftAndPrint() {
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    public void moveRight() {
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariableTest simv = new SpaceInvaderMemberVariableTest();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치: %d\n", simv.location);
        simv.moveLeft();
        System.out.printf("최종 위치: %d", simv.location);
    }
}
