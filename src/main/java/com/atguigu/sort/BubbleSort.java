package com.atguigu.sort;

/** 冒泡排序
 * @Author: chenbensheng
 * @CreateDate: 2020/11/5 20:23
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }


    private static int[] bubbleSort(int[] arr) {

        if(arr.length==0){
            return arr;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {

                if(arr[j]>arr[j+1]){
                  int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j]=temp;
                }
            }
        }
        return arr;
    }

}
