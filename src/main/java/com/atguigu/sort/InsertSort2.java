package com.atguigu.sort;

import java.util.Arrays;

/**
 * Author:   chenbensheng
 * Date:     2019/6/17 15:31
 */
public class InsertSort2 {

    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        insert(arr);
    }
    public static void insert(int[] arr){
        for(int i=1;i<arr.length;i++){
            int insertVal=arr[i];
            int insertIndex=i-1;//带插入de  前一个元素

            while(insertIndex>=0&&arr[insertIndex]>insertVal){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=insertVal;
            System.out.println("第"+i+"次插入");
            System.out.println(Arrays.toString(arr));
        }
    }
}
