package com.example.week4.day4;

public class Address {
    private String fullAddr;
    private String side;
    private String sigungu;

    public Address(String fullAddr, String side, String sigungu) {
        this.fullAddr = fullAddr;
        this.side = side;
        this.sigungu = sigungu;
    }

    public String getFullAddr() {
        return fullAddr;
    }

    public String getSide() {
        return side;
    }

    public String getSigungu() {
        return sigungu;
    }
}
