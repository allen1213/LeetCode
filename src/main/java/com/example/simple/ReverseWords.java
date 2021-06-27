package com.example.simple;

public class ReverseWords {

    /*public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if (i != s1.length - 1)
                sb.append(reverse(s1[i])).append(" ");
            else
                sb.append(reverse(s1[i]));
        }
        return sb.toString();
    }

    public String reverse(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        char temp;
        while (i <= j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i ++;
            j --;
        }
        return String.valueOf(chars);
    }*/

    public String reverseWords(String s) {
        char[] chs = s.toCharArray();
        int len = s.length();
        int start = 0, end = 0;
        while (end < len) {
            int num = s.indexOf(" ", start);
            end = num;
            if (num < 0) {
                end = len;
            }
            reverse(chs, start, end - 1);
            start = end + 1;
            if (num < 0) {
                break;
            }
        }
        return new String(chs);
    }

    private void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char tmp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = tmp;
        }
    }

    public static void main(String[] args) {
        ReverseWords r = new ReverseWords();
        System.out.println(r.reverseWords("Let's take LeetCode contest"));
    }
}
