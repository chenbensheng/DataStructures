package com.test;

/**
 * 从M个数中找出最小的N个数
 */
public class TestDemo1 {


    public static void main(String[] args) {
        //getNumber();
    }

    public static  int[]  getNumber(int [] arr,int k){
        if(k==0){
            return new int[0];
        }
        if(k==arr.length){
            return arr;
        }

        int[] heap=new int[k];
        for (int i = 0; i < k; i++) {
            heap[i]=arr[i];
        }
        buildHeap(heap);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < heap[0]) {
                heap[0] = arr[i];
                heapTest(heap, 0);
            }
        }
        //返回堆
        return heap;

    }

    private static void buildHeap(int[] nums) {
        int lastNode = nums.length - 1;
        int startHeapify = (lastNode - 1) / 2;
        while (startHeapify >= 0) {
            heapTest(nums, startHeapify--);
        }
    }

    private static void heapTest(int[] nums, int i) {
        int len = nums.length;
        if (i >= len)
            return;
        int c1 = ((i << 1) + 1), c2 = ((i << 1) + 2);
        int max = i;
        if (c1 < len && nums[c1] > nums[max])
            max = c1;
        if (c2 < len && nums[c2] > nums[max])
            max = c2;
        if (max != i) {
            swap(nums, max, i);
            heapTest(nums, max);
        }
    }
    //交换数组中i索引和j索引元素的位置
    private static void swap(int[] nums, int i, int j) {

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }



}
