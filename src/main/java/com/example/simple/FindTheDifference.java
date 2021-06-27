package com.example.simple;

import java.util.HashSet;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {

        /*int[] arr = new int[26];
        char[] c = s.toCharArray();
        char[] h = t.toCharArray();
        for (char ch : c) arr[ch - 'a'] ++;
        for (char ch : h) {
            arr[ch - 'a'] --;
            if (arr[ch - 'a'] < 0)
                return ch;
        }
        return 0;*/
        //相同字符异或操作以后为0，最后会得到被添加的字母
        char res = 0;
        int len = s.length();
        for (int i = 0;i < s.length(); i ++) {
            res ^= s.charAt(i) ^ t.charAt(i);
        }
        res ^= t.charAt(len);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("a", "aa"));
    }
}
/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
