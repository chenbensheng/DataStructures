package com.atguigu.sort;

import java.util.Arrays;

/**
 * Author:   chenbensheng
 * Date:     2019/6/13 17:07  —°‘Ò≈≈–Ú
 */
public class SelectSort2 {

    public static void main(String[] args) {
        int [] arr= {50, 183, 19, 21, 140, 116, 89, 169, 67, 128, 19, 105, 71, 54, 63 };

        System.out.println("≈≈–Ú«∞");
        System.out.println(Arrays.toString(arr));

        selectSort(arr);
        System.out.println("≈≈–Ú∫Û");
        System.out.println(Arrays.toString(arr));
    }


    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length-1 ; i++) {
            int midIndex=i;
            for (int j = i+1; j < arr.length-1 ; j++) {

                if(arr[j]<arr[midIndex]){
                    midIndex=j;
                }
            }
            if(i!=midIndex){
               int temp=arr[i];
               arr[i]=arr[midIndex];
               arr[midIndex]=temp;
            }
        }



    }
}
