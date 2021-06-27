package com.example.sort;

import java.util.Arrays;

public class HeapSort {

    public static void adjustHeap(int[] arr,int i,int length) {

        //取出当前元素
        int temp = arr[i];

        // j = i * 2 + 1 为 i 结点的左子节点,下一次循环，要以该节点开始找左右子节点
        for (int j = 2 * i + 1; j < length; j = j * 2 + 1) {
            //左子节点的值小于右子节点的值
            if (j + 1 < length && arr[j] < arr[j + 1])
                j ++;

            //若右子节点的值大于父节点的值，将子节点赋值给父节点,并且改变父节点的下标
            //此时顶部已是最大值，需要
            if (arr[j] > temp) {
                arr[i] = arr[j];
                i = j;
            } else {
                break;
            }
        }

        //将原来堆顶的元素放到左/右子节点，也有可能不变
        arr[i] = temp;

    }

    public static void heapSort(int[] arr) {

        int length = arr.length;
        //首先从第一个非叶子节点 arr.length / 2 - 1 从左到右，从上到下，开始构建大顶堆
        for (int i = arr.length / 2 - 1 ; i >= 0 ; i--) {
            adjustHeap(arr,i, length);
        }

        int temp;
        for (int i = length - 1; i >= 0 ; i--) {
            //交换第一个和最后一个元素，也不一定是最后一个，因为有序序列放在最后了，应该是有序序列的前一个元素
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            //重新调整
            adjustHeap(arr,0,i);
        }

    }

    public static void main(String[] args) {

        int[] arr = {4,6,8,5,9};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
