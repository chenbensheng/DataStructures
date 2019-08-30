package com.atguigu.sort;

import java.util.Arrays;

/**
 * Author:   chenbensheng
 * Date:     2019/6/13 17:07  —°‘Ò≈≈–Ú
 */
public class SelectSort2 {

    public static void main(String[] args) {
        int [] arr=new int[200];
        for(int i=0;i<200;i++){
            arr[i]=(int) (Math.random()*200);
        }
        System.out.println("≈≈–Ú«∞");
        System.out.println(Arrays.toString(arr));

        selectSort(arr);
        System.out.println("≈≈–Ú∫Û");
        System.out.println(Arrays.toString(arr));
    }


    public static void selectSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIndex=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }

        }

    }
}
