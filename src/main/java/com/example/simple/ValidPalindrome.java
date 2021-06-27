package com.example.simple;

/**
 * 验证回文串
 *
 * 题解
 */
public class ValidPalindrome {

    public static boolean isPalindromeOne(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        String str = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
            
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return true;
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
