package com.example.simple;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while (n > 0) {

            n -= i;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        ArrangeCoins a = new ArrangeCoins();
        System.out.println(a.arrangeCoins(8));
    }
}
