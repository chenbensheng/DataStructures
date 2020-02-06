package com.atguigu.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr={4,-1,-3,1,4,0,0,5,7,9,0,10};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int startIndex,int endIndex){

        // 如果start和end碰头了，说明要我排的这个子数列就剩下一个数了，就不用排序了
        if(startIndex>=endIndex){
            return;
        }

        int pivot=arr[startIndex];
        int left=startIndex;
        int right=endIndex;

        while (left<right){
            while (left<right &&arr[right]>pivot){
                right--;
            }
            while (left<right &&arr[left]<=pivot){
                left++;
            }

            if(left<right){
                int p=arr[left];
                arr[left]=arr[right];
                arr[right]=p;
            }
        }
        arr[startIndex]=arr[left];
        arr[left]=pivot;
        quickSort(arr,startIndex,left-1);
        quickSort(arr,left+1,endIndex);
    }


}
