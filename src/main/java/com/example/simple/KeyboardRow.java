package com.example.simple;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        for (String word : words) {
            if (judge(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    public static boolean judge(String words) {
        int countLine1 = 0;
        int countLine2 = 0;
        int countLine3 = 0;
        String singleWords = words.toLowerCase();
        for (int i = 0; i < singleWords.length(); i++) {
            char c = singleWords.charAt(i);
            if (c == 'q' || c == 'w' || c == 'e'
                    || c == 'r' || c == 't' || c == 'y'
                    || c == 'u' || c == 'i' || c == 'o'
                    || c == 'p') {
                countLine1++;
            }
            if (c == 'a' || c == 's' || c == 'd'
                    || c == 'f' || c == 'g' || c == 'h'
                    || c == 'j' || c == 'k' || c == 'l') {
                countLine2++;
            }
            if (c == 'z' || c == 'x' || c == 'c'
                    || c == 'v' || c == 'b' || c == 'n'
                    || c == 'm') {
                countLine3++;
            }
        }
        return (countLine1 == singleWords.length() || countLine2 == singleWords.length() || countLine3 == singleWords.length());
    }

    public String[] findWords2(String[] words) {
        String[] a = new String[]{"QWERTYUIOPqwertyuiop", "ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm"};
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int flag = -1;
            if (a[0].indexOf(words[i].charAt(0)) >= 0) {
                flag = 0;
            } else if (a[1].indexOf(words[i].charAt(0)) >= 0) {
                flag = 1;
            } else if (a[2].indexOf(words[i].charAt(0)) >= 0) {
                flag = 2;
            }
            for (int j = 0; j < words[i].length(); j++) {
                if (a[flag].indexOf(words[i].charAt(j)) < 0) {
                    flag = -1;
                    break;
                }
            }
            if (flag != -1)
                res.add(words[i]);
        }
        String[] ans = new String[res.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {

    }


}

/**
 * 500. 键盘行
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * <p>
 * <p>
 * <p>
 * American keyboard
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 * <p>
 * <p>
 * 注意：
 * <p>
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 */
