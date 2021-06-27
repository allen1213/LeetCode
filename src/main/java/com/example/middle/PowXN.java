package com.example.middle;

public class PowXN {

    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        int abs = Math.abs(n);
        double res = 1.0;
        for (int i = 1; i <= abs; i++) {
            if (n > 0) res *= x;
            else res *= 1 / x;
        }
        return res;
    }

    public static void main(String[] args) {
        PowXN p = new PowXN();
        System.out.println(p.myPow(2.00000, -2));
    }

}
