package com.example.simple;

/**
 * 题解
 *  -1-  取数组中第一个元素作为基准，并且假设这个元素就是所有数组元素的前缀
 *  -2-  将第一个元素和后面的元素做比较，若后面的元素不是以这个元素开头，则将这个元素的最后一个截掉在继续判断
 *  -3-  若第一个元素截到长度为1时，还不相等则没有公共前缀
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (null == strs || strs.length == 0) {
            return "";
        }
        String str = strs[0];
        for (String s : strs) {
            while (!s.startsWith(str)) {
                if (str.length() == 1) {
                    return "";
                }
                str = str.substring(0,str.length() - 1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}

/**
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 **/