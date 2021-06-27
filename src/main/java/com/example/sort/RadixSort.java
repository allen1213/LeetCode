package com.example.sort;

public class RadixSort {

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void radixSort(int[] arr) {

        //首先找到数组中最大的数
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        int length = (max + "").length();

        //定义一个二维数组，每个一维数组中存放 arr中对应的数
        int[][] bucket = new int[10][arr.length];

        //记录每个一维数组中放有几个数
        int[] count = new int[10];

        //外层总共要循环最大数的长度次
        for (int i = 0, n = 1; i < length; i++, n *= 10) {
            //遍历数组，将每个元素放到对应的桶中
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / n % 10;
                //bucket[num]  表示将 arr[j]放到第num个桶中
                //并且对应的桶中放了多少个数 ， 也就是count[num]，表示第num个桶中放的个数
                bucket[num][count[num]] = arr[j];
                count[num] ++;
            }

            //记录arr的下标
            int index = 0;
            //将数放到对应的桶之后，在从桶中拿出数，放到arr中
            for (int k = 0; k < count.length; k++) {
                //count[i] 为0 ，说明没有数存放到该桶中，所以不用遍历
                if (count[k] != 0) {
                    //每个桶中有多少个元素就放多少个到arr中
                    for (int l = 0; l < count[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }
                count[k] = 0;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {50, 3, 542, 745, 2014, 154, 63, 616};
        print(arr);
        radixSort(arr);
        print(arr);
    }
}
