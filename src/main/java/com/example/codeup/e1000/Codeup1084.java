package com.example.codeup.e1000;

import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArr = br.readLine().split(" ");

        int cnt = 0;
        for (int i = 0; i < Integer.parseInt(sArr[0]); i++) {
            for (int j = 0; j < Integer.parseInt(sArr[1]); j++) {
                for (int k = 0; k < Integer.parseInt(sArr[2]); k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
