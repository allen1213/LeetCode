package com.example.recursion;

public class Test {

    public static void print(int n) {
        if (n >= 2) print(n-1);
        System.out.println(n);
    }

    public static int info(int n) {
        if (n == 1) return 1;
        return n * info(n-1);
    }

    public static void main(String[] args) {
        //print(31);
        System.out.println(info(5));
    }
}
