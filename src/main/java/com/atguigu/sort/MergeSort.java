package com.atguigu.sort;

import com.alibaba.fastjson.JSON;

/**
 *  归并排序
 * ①把 n 个记录看成 n 个长度为1的有序子表；
 * ②进行两两归并使记录关键字有序，得到 n/2 个长度为 2 的有序子表；
 * ③重复第②步直到所有记录归并成一个长度为 n 的有序表为止。
 * @Author: chenbensheng
 * @CreateDate: 2020/11/5 20:46
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            int[] tmp = new int[arr.length];    //新建一个临时数组存放
            mergeSort(arr,low,mid); //对左边序列进行归并排序
            mergeSort(arr,mid+1,high);  //对右边序列进行归并排序
            merge(arr,low,mid,high,tmp);    //合并两个有序序列
        }
    }

    public static void merge(int[] arr,int low,int mid,int high,int[] tmp){
        int i = 0;
        int j = low,k = mid+1;  //左边序列和右边序列起始索引
        while(j <= mid && k <= high){
            if(arr[j] < arr[k]){
                tmp[i++] = arr[j++];
            }else{
                tmp[i++] = arr[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            tmp[i++] = arr[j++];
        }
        //若右边序列还有剩余，则将其全部拷贝进tmp[]中
        while(k <= high){
            tmp[i++] = arr[k++];
        }

        for(int t=0;t<i;t++){
            arr[low+t] = tmp[t];
        }
    }

}