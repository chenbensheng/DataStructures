package com.atguigu.sort;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/11/10 14:37
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12,0,-1};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void mergeSort(int[] arr,int low,int high){
        if (low<high){
           int mid=(high+low)/2;
            mergeSort(arr,0,mid);
            mergeSort(arr,mid+1,high);
            int[] tmp=new int[arr.length];
            merge(arr,0,mid,high,tmp);
        }
    }

    public static void merge(int[] arr,int low,int mid,int high,int [] temp){
        int i=0;
        //初始化左右序列指针
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[i++]=arr[left++];
            }else {
                temp[i++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[i++]=arr[left++];
        }
        while(right<=high){
            temp[i++]=arr[right++];
        }

        for (int t = 0; t <i  ; t++) {
            arr[low+t]=temp[t];
        }
    }

}
