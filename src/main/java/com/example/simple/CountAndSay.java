package com.example.simple;

/**
 * 外观数列:下一项是对前一项的描述
 *
 * 题解
 * -1-  新建一个StringBuilder ，存放每个数字对应的数列
 * -2-  当n= 1 时 数列 为 1  ，so  循环从 2 开始
 * -3-  当 i= n时 要获取 上一个数对应的序列  ，
 * -4-  得到上一个序列之后，遍历这个序列，查找连续相同的数字，start 记录第一次出现的字符位置，j 一直往后移
 * -5-  当start 和 第j个字符不相同时，builder.append  否则  count ++
 * -6-  在遍历序列结束时还要builder.append 一次
 * -7-  返回str  得到结果
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            int count = 1;
            char start = str.charAt(0);
            StringBuilder builder = new StringBuilder();
            for (int j = 1; j < str.length(); j++) {
                if (start == str.charAt(j)) {
                    count ++;
                } else {
                    builder.append(count).append(start);
                    start = str.charAt(j);
                    count = 1;
                }
            }
            builder.append(count).append(start);
            str = builder.toString();
        }
        return  str;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }


}

/**
 * 外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 *
 * 注意：整数序列中的每一项将表示为一个字符串。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "1211"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
