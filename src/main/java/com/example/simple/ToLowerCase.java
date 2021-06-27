package com.example.simple;

public class ToLowerCase {

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i ++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z')
                chars[i] = (char) (c + 32);
        }
        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        System.out.println(new ToLowerCase().toLowerCase("LOVE BO"));
    }
}
