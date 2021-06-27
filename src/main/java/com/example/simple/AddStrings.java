package com.example.simple;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AddStrings {

    public String addStrings(String num1, String num2) {

        return "";

    }

    public static void main(String[] args) {
        BigInteger res = BigInteger.valueOf(0);
        char[] chars = "1234".toCharArray();
        for (int i = chars.length - 1,n = 1; i >= 0; i--,n *= 10) {
            BigInteger bigInteger = BigInteger.valueOf((chars[i] - '0') * n);
            res.add(bigInteger);
        }
        System.out.println(res);
    }
}
/**
 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。

 注意：

 num1 和num2 的长度都小于 5100.
 num1 和num2 都只包含数字 0-9.
 num1 和num2 都不包含任何前导零。
 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-strings
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */