package com.example.week2.day5;

import java.util.Scanner;

public class CollatzConjecture {
    public int solution(long num) {
        int answer = 0;

        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer += 1;

            if (answer > 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        System.out.printf("%d", collatzConjecture.solution(num));
    }
}
