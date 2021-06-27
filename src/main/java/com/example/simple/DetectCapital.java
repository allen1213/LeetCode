package com.example.simple;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        char[] chars = word.toCharArray();
        int upper = 0,lower = 0;
        for (char c : chars) {
            if (c >= 'a' && c <= 'z') lower ++;
            else upper ++;
        }
        return upper == chars.length || lower == chars.length || (chars[0] < 'a' && upper == 1 );
    }



}
