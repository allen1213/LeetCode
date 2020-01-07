package com.example.demo;

/**
 * 杨辉三角
 */
public class PascalsTriangle {

    public static void pascalsTriangle(int n) {

        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = new int[i +1];
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }

                System.out.print(arr[i][j]+"\t");

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        pascalsTriangle(5);
    }
}
