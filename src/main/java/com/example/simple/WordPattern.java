package com.example.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        String[] s = str.split(" ");

        if (s.length != pattern.length()) return false;

        for (int i = 0; i < s.length; i++) {
            char key = pattern.charAt(i);
            if (map.containsKey(key)) {
                if (!map.get(key).equals(s[i]))
                    return false;
            } else {
                if (map.containsValue(s[i])) return false;
                map.put(key,s[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
}
/**
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 示例1:
 *
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 *
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 *
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 *
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
