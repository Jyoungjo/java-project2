package com.example.codeup.e1000;

import java.util.Scanner;

public class Codeup1099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        // 배열에 입력값 채우기
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 시작 좌표 설정
        int x = 1;
        int y = 1;

        // 무한 루프로 이동하는 과정 짜기
        while (true) {
            // 1. 먹이를 바로 발견한 경우
            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }
            // 2. 오른쪽이 막히지 않은 경우
            if (arr[x][y + 1] != 1) {
                arr[x][y] = 9;
                y++;
            }
            // 3. 오른쪽이 막힌 경우 -> 아래쪽이 막히지 않은 경우
            else if (arr[x + 1][y] != 1) {
                arr[x][y] = 9;
                x++;
            }
            // 4. 오른쪽이 막힌 경우 -> 아래쪽이 막히거나 먹이를 발견한 경우
            else {
                arr[x][y] = 9;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
