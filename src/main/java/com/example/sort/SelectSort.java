package com.example.sort;

public class SelectSort {

    /**
     * 选择排序：关键是找到序列中最小的值，将最小值放到数组前面
     * @param a
     * @return
     */
    public static int[] selectSort(int[] a) {

        int min,minIndex;
        for (int i = 0; i < a.length; i++) {
            //先将序列的第一个数当成最小的数，记录该值及其下标
            min = a[i];
            minIndex = i;
            //遍历序列，找到序列中的最小值，改变最小值的值和下标
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            //最后将 原来的数移动到最小值下标的位置
            a[minIndex] = a[i];
            //最小值往前移
            a[i] = min;
        }

        return a;
    }

    public static void main(String[] args) {
        /*int[] a ={11,23,9,34,20,12,22,15};
        selectSort(a);
        for (int i : a) {
            System.out.print(i + "  ");
        }
        System.out.println();*/
        int[] a = new int[80000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 80000);
        }
        long start = System.currentTimeMillis();
        selectSort(a);
        System.out.println(System.currentTimeMillis() - start);
    }
}
