package com.example.sort;

import java.util.Arrays;

public class Sort {

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    //简单插入排序，关键点：未排序的序列和已排序的序列下标值相差1
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] >= temp) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j+1] = temp;
        }
    }

    //希尔排序  关键点，定义步长，移动元素时根据步长来移动
    public static void shellSort(int[] arr) {
        int gap = arr.length >> 1;
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int j = i - gap;
                int temp = arr[i];
                for (;j >= 0 && arr[j] >= temp; j -= gap)
                    arr[j+gap] = arr[j];
                arr[j+gap] = temp;
            }
            gap >>= 1;
        }
    }

    //选择排序  关键点：选择一个最小的放到最前面
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            int temp = arr[i];
            for (int j = i; j < arr.length; j ++)
                if (temp >= arr[j]) {
                    temp = arr[j];
                    index = j;
                }
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    //堆排序
    public static void heapSort(int[] arr) {}

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //快速排序-递归  关键点：双指针从前后两个方向走
    public static void quickSort(int[] arr,int left,int right) {

        if (left < right) {
            int i = left;
            int j = right;
            int first = arr[left];
            while (i < j) {

                while (i < right && first > arr[i])
                    i ++;
                while (j > left && first < arr[j])
                    j --;

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i ++;
                    j --;
                }
            }
            quickSort(arr,left,j);
            quickSort(arr,i,right);
        }

    }

    //归并排序 关键点：先将数组分成到最小，在对数据做合并
    //该方法做合并操作，同样采用双指针，从前和中间开始往后走
    private static void merge(int[] arr,int left,int mid,int right,int[] temp) {

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] > arr[j])
                temp[k++] = arr[j++];
            else
                temp[k++] = arr[i++];
        }

        //判断是否还有剩余的元素在原数组中
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];

        //重新将temp中的值赋值到元数组中，注意不是将arr中的所有值都重新赋值
        k = 0;
        while (left <= right)
            arr[left++] = temp[k++];
    }

    public static void mergeSort(int[] arr,int left,int right,int[] temp) {
        if (left < right) {
            int mid = (left + right) >> 1;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid+1, right, temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void radixSort(int[] arr) {

        //找到数组中的最大值
        int max = arr[0];
        for (int i : arr)  if (i > max) max = i;

        //外层要循环的次数
        int length = (Math.abs(max) + "").length();

        //定义桶，以及每个桶中元素的个数
        int[][] bucket = new int[10][arr.length];
        int[] count = new int[10];

        for (int i = 0,n = 1;i < length; i++,n  *= 10) {

            //遍历数组，循环取到每个元素的各十百千...位，分别放入桶中
            for (int j = 0; j < arr.length; j++) {
                int res = arr[j] / n % 10;
                bucket[res][count[res] ++] = arr[j];
            }

            //将桶中的数据放回到元数组中，并且是全部放完
            int index = 0;
            for (int j = 0; j < count.length; j++) {
                //若桶中没有元素，则直接跳过
                if (count[j] != 0) {
                    for (int k = 0; k < count[j]; k++) {
                        arr[index++] = bucket[j][k];
                    }
                    //切记切记 ！！！！！！！ 循环结束要清空，以便下次循环
                    count[j] = 0;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        initArray(arr);
        print(arr);
        radixSort(arr);
        //quickSort(arr,0,arr.length - 1);
        //mergeSort(arr,0,arr.length - 1,new int[arr.length]);
        print(arr);
    }

}
