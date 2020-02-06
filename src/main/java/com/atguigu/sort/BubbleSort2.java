package com.atguigu.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort2 {

    @Test
    public void test(){
        int arr[] = {-1,0,16,-5,3,8};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);


    }


    public void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            //有序标志--默认为true
            boolean isSorted=true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }
            //如果是有序的---则不进行下一轮排序
            if(isSorted){
                break;
            }
        }
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }
}
