package com.example.sort;

public class BubbleSort {

    public static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i -1; j++) {
                if (a[j] > a[j+1]) {
                    //若没有发生交换，说明已经有序
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[80000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 80000);
        }
        long start = System.currentTimeMillis();
        bubbleSort(a);
        System.out.println(System.currentTimeMillis() - start);
        //print(a);
    }
}
