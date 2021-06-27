package com.example.simple;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagramOne(String s, String t) {
        char[] c = s.toCharArray();
        char[] h = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(h);
        return Arrays.equals(c, h);
    }

    public static boolean isAnagram(String s, String t) {

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < s.length(); i++)
            a[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            b[t.charAt(i) - 'a']++;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        return true;
    }

}

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
