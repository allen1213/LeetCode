package com.example.simple;

import java.util.*;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length; i++) set.add(i);

        for (int num : nums) {
            if (set.contains(num)) set.remove(num);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        FindDisappearedNumbers f = new FindDisappearedNumbers();
        System.out.println(f.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }


}
