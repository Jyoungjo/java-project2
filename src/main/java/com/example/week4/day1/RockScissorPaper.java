package com.example.week4.day1;

import java.util.Scanner;

public class RockScissorPaper {
    public String play(int user, int computer) {
        if (user == 0 & computer == 1) {
            return "win";
        } else if (user == 1 & computer == 2) {
            return "win";
        } else if (user == 2 & computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }
    void printResult(int user, int computer) {
        System.out.printf("%s", play(user, computer));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockScissorPaper rsp = new RockScissorPaper();
        rsp.printResult(sc.nextInt(), sc.nextInt());
    }
}
