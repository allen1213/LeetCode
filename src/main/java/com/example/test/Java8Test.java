package com.example.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Test {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("12345 789".split(""));

        List<String> collect = list.stream().filter(i -> !i.equals(" ")).collect(Collectors.toList());

        System.out.println(collect);

    }

}
