package com.example.simple;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++)
            map.put(chars[i],map.getOrDefault(chars[i],0) + 1);

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
