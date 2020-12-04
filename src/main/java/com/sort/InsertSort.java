package com.sort;

/**
 * @Author: chenbensheng
 *  插入排序
 * @CreateDate: 2020/11/5 19:41
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};

        insertSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
    
    private static void insertSort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int j=i;
            while (j>0){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                    j--;
                }else {
                    break;
                }
            }

        }
    }
}
