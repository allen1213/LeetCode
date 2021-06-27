package com.example.simple;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        /*if (n == 1) return true;
        int res = 1;
        for (int i = 0; i < Math.sqrt(n); i++) {
            res *= 3;
            if (res == n) return true;
            if (res > n) return false;
        }
        return false;*/

        /*if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;*/
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }
}
