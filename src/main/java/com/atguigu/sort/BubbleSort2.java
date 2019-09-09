package com.atguigu.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort2 {

    @Test
    public void test(){
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);

        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }



    public void bubbleSort(int[] arr){
        int temp=0;
        //默认都是有序的~
        boolean flag=false;
        int lastExchangeIndex = 0;
        int unorderedBorder = arr.length-1;
        for (int i = 0; i <arr.length-1 ; i++) {

            for (int j = 0; j <unorderedBorder ; j++) {
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //记录下最后一次交换元素的位置
                    lastExchangeIndex=j;
                }
            }
            unorderedBorder=lastExchangeIndex;
            //flag=false 说明没有交换过
            if(!flag){
                break;
            }
        }
    }
}
