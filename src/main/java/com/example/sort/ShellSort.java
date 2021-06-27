package com.example.sort;

public class ShellSort {

    public static int[] shellSort(int[] a) {

        int gap = a.length / 2;
        while (gap > 0) {
            //同样是  插入排序 （插入排序中 i的下标从1 开始，既要插入的数）
            // 只是 希尔排序被分成gap组
            // （假如数组长度为4，则分为两组，下标为0的数和下标为2的数为一组，此时
            // i的下标应该从2开始，也就是要插入的数，那有序序列的最后一个自然为下标为0的数）
            for (int i = gap; i < a.length; i++) {
                //要插入的数
                int temp = a[i];
                //记录有序序列的下标
                int j = i - gap;
                //遍历有序序列，若大于要插入的值，则往后移
                for (; j >= 0 && a[j] > temp;j -= gap)
                    a[j + gap] = a[j];
                //最后 下标为 j + gap 就是 temp 要插入的位置
                a[j + gap] = temp;
            }
            gap /= 2;
        }

        return a;
    }


    public static void main(String[] args) {
        /*int[] a ={32,43,23,13,5};
        shellSort(a);
        for (int i : a) {
            System.out.print(i + "  ");
        }
        System.out.println();*/
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        shellSort(a);
        System.out.println(System.currentTimeMillis() - start);
    }
}
