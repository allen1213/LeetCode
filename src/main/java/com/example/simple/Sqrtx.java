package com.example.simple;

/** X 的平方跟
 *
 * 题解
 *
 *
 */
public class Sqrtx {

    /**
     * 牛顿迭代法
     * @param x
     * @return
     */
    public static int mySqrtN(int x) {

        long a = x;
        while ( a * a > x) {
            a = ( a + x / a ) / 2;
        }

        return (int) a;
    }

    /**
     * 二分法
     * @param x
     * @return
     */
    public static int mySqrt(int x) {

        long low = 0;
        long high = x / 2 + 1;

        while (low < high) {
            long mid = ( low + high + 1) >>> 1;
            long square = mid * mid;
            if (square > x) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }

        return (int) low;
    }


    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

}

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
