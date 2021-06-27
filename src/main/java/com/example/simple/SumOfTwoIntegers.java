package com.example.simple;

//a + b 的问题拆分为 (a 和 b 的无进位结果) + (a 和 b 的进位结果)
//无进位加法使用异或运算计算得出
//进位结果使用与运算和移位运算计算得出
//循环此过程，直到进位为 0
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {

        while (b != 0) {

            int temp = a ^ b;

            b = ( a & b) << 1;

            a = temp;

        }

        return a;
    }

    public static void main(String[] args) {
        SumOfTwoIntegers s = new SumOfTwoIntegers();

        System.out.println(s.getSum(4, 5));
    }
}
