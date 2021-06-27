package com.example.simple;

public class ConvertToBase7 {

    public String convertToBase7(int num) {
/*
        StringBuilder sb = new StringBuilder();
        int n = num;
        if (num < 0) n = 0 - num;

        while (n > 0) {
            sb.append(n % 7);
            n /= 7;
        }
        if (num < 0) sb.append("-");
        return sb.reverse().toString();*/

        return Integer.toString(num, 7);

    }

    public static void main(String[] args) {
        ConvertToBase7 c = new ConvertToBase7();
        System.out.println(c.convertToBase7(-7));
    }

}
/**
 * 504. 七进制数
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 100
 * 输出: "202"
 * 示例 2:
 * <p>
 * 输入: -7
 * 输出: "-10"
 */