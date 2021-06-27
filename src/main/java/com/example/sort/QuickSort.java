package com.example.sort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] a, int left, int right) {

        if (left > right) return;

        //首先将第一个数作为基准数作为比较
        int first = a[left];

        int temp;
        int i = left, j = right;

        while (i < j) {

            while (a[j] >= first && i < j)
                j--;

            while (a[i] <= first && i < j)
                i++;

            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        a[left] = a[i];
        a[i] = first;

        quickSort(a, left, j - 1);
        quickSort(a, j + 1, right);

    }

    public static void main(String[] args) {
        int[] a = {6, 1, 2, 3, 7, 4, 9};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
