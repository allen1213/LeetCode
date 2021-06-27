package com.example.simple;

import java.util.*;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        /**
         * 1.将原字符串给出拷贝一遍组成新字符串；
         * 2.掐头去尾留中间；
         * 3.如果还包含原字符串，则满足题意
         */
        /*String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);*/


        for(int i = 1; i <= s.length() / 2 + 1; i++){
            if(s.length() % i == 0){
                if(judge(s.substring(0,i),s))
                    return true;
            }
        }
        return false;

        /*for (int i = s.length() - 1;i >= 2;i--) {
            if (s.length() % i == 0) {
                String pattern = s.substring(0,i);
                String arr[] = s.split(pattern);
                if (arr.length == 0) {
                    return true;
                }
            }
        }
        return false;*/
    }

    public boolean judge(String sub, String S){
        int len = sub.length();
        for(int i = len;i < S.length();i++){
            if(S.charAt(i) != sub.charAt(i%len))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern r = new RepeatedSubstringPattern();
        System.out.println(r.repeatedSubstringPattern("abcabcabcabcabc"));
    }


}
