package com.example.middle;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatChar {

    /**
     *   解题思路：
     *   -1-  定义两个变量 start = end = 0
     *   -2-  start 变量记录 第一次出现相同字符的位置
     *          并且和 map 中对应重复出现字符的位置做比较
     *          end ++
     *   -3-  记录 len 长度  end - start
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int res = 0;
        int end=0,start=0;
        Map<Character,Integer> map=new HashMap<>();
        for(;start<n && end<n;end++){
            if(map.containsKey(s.charAt(end))){
                start=Math.max(map.get(s.charAt(end)),start);//从有重复的下一个位置继续找
            }
            //注意  这里 put 和 res 的值 一定要加1，否者只有一个字符的时候会输出0
            map.put(s.charAt(end),end+1);//map每次更新
            res=Math.max(res,end-start+1);//结果每次更新
        }
        return res;

        /*if (s == null) {
            return 0;
        }
        if (" ".equals(s)) {
            return 1;
        }
        int start = 0,end = 0,len = 0;

        Map<Character,Integer> map = new HashMap<>();

        for (;start < s.length() && end < s.length(); end ++) {

            if (map.containsKey(s.charAt(end))) {
                start = start > map.get(s.charAt(end)) ? start : map.get(s.charAt(end));
            }

            map.put(s.charAt(end),end);

            len = len > end - start ? len : end -start;

        }

        return len;*/

    }

    public static void main(String[] args) {
        //gfdgsagasgsg
        System.out.println(lengthOfLongestSubstring("  "));
    }
}
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
