package com.example.simple;

public class CountSegments {
    public int countSegments(String s) {
        boolean Noletter=true;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                Noletter=true;
            if(s.charAt(i)!=' '&&Noletter==true){
                count++;
                Noletter=false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountSegments c = new CountSegments();
        System.out.println(c.countSegments("Hello, my name is John"));
    }
}
