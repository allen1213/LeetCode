package com.example.simple;

/**  实现 strStr() 函数
 */
public class ImplementStrStr {

    /**
     *题解
     * -1-  判断needle 是否是 haystack  的前缀
     * -2-  若不是，则从第0个开始截取  haystack  的一个字符
     * -3-  每截取一次 i++
     */
    public static int strStrSelf(String haystack, String needle) {

        if (haystack.length() < needle.length()) {
            return -1;
        }

        if (null == needle || "".equals(needle)) {
            return 0;
        }

        int i = 0,size = haystack.length();
        while (!haystack.startsWith(needle)) {
            haystack = haystack.substring(1);
            i ++;
            if (i == size-1) {
                return -1;
            }
        }
        return i;
    }

    /**
     *题解  KMP
     * -1-
     * -2-
     * -3-
     */
    public static int strStr(String haystack, String needle) {


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","a"));

        //System.out.println("hello".indexOf(""));
    }
}

/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
