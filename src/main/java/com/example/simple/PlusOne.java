package com.example.simple;

/**  加一
 *
 * 题解
 * 主要处理最后 一位是9 的情况  如果最后一位是9 则，最后一位置0，前一位 ++
 * 若全部数字都为9 ，则所有置0  ，开辟一个新的数组 数组第一个为1
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] != 9) {
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1,9,9};
        plusOne(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }
}

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
