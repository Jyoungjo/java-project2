package com.example.week1.day4;

public class PrintfEx {

    public void print() {
        System.out.printf("%s", "Hello");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx(); // PrintfEx 나와라 - PrintfEx 나오게 해서
        printfEx.print(); // printfEx야 물대포를 쏴줘 - printfEx가 print() 메소드 실행하게 함
    }
}
