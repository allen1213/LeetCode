package com.example.sort;

import java.util.Arrays;

public class InsertSort {

    public static int[] insertSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            //记录要插入的数
            int temp = a[i];
            //记录要插入数的前一个下下标，也就是有序序列的最后一个位置
            int j = i - 1;
            //遍历有序序列，判断有序序列的值是否大于要插入的值
            //若大于插入的值，则将该值往后移动一位
            /*while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j --;
            }*/

            for (;j >= 0 && a[j] > temp;j --) a[j + 1] = a[j];
            //j+1 的值就是要插入数的下标
            a[j + 1] = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        /*int[] a ={11,23,9,34,20,12,22,15};
        insertSort(a);
        for (int i : a) {
            System.out.print(i + "  ");
        }
        System.out.println();*/
        int[] a = new int[80000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 80000);
        }
        long start = System.currentTimeMillis();
        insertSort(a);
        System.out.println(System.currentTimeMillis() - start);
    }
}
