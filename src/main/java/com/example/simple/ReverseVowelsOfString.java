package com.example.simple;

public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {

        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        char temp;

        while (i < j) {
            while (i < j && !isVowel(s.charAt(i)))
                i ++;
            while (i < j && !isVowel(s.charAt(j)))
                j --;

            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i ++;
            j --;

        }

        /*StringBuilder sb = new StringBuilder();

        while (i < s.length()) {
            char c = s.charAt(i++);
            if (isVowel(c)) {
                char h = s.charAt(j--);
                if (isVowel(h)) {
                    sb.append(h);
                } else {
                    while (j >= 0) {
                        h = s.charAt(j --);
                        if (isVowel(h)) {
                            sb.append(h);
                            break;
                        }
                    }
                }
            } else {
                sb.append(c);
            }

        }*/

        return new String(chars);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leotcede"));
        System.out.println("leotcede".equals(reverseVowels("leetcode")));
    }

}

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
