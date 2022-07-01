package com.bjpowernode;

public class HelloMaven {

    public int addNumber(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        HelloMaven h = new HelloMaven();
        int res = h.addNumber(20, 30);
        System.out.println("res=" + res);
    }
}
