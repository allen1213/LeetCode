package com.example.simple;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        long res = 0;
        int y = x;

        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return y == (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : res);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

}
/**
 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true
 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 **/