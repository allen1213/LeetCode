package com.example.middle;

public class LongestPalindromicSubstring {


    /**
     * 题解
     * s[i][j] 是回文串，则 s[i] == s[j] 并且 s[i + 1][j - 1]是回文串
     */
    private String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int length = chars.length;
        boolean[][] dp = new boolean[length][length];

        int startIndex = 0;
        int endIndex = 0;

        for (int len = 1; len <= length; len++) {
            for (int i = 0; i < length; i++) {
                int j = i + len - 1;
                if (j >= length) break;

                dp[i][j] = (len == 1 || len == 2 || dp[i + 1][j - 1]) && chars[i] == chars[j];

                if (dp[i][j] && len > startIndex) {
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        return s.substring(startIndex, endIndex + 1);
    }

    public static void main(String[] args) {


        System.out.println(new LongestPalindromicSubstring().longestPalindrome("abba"));

    }
}

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
