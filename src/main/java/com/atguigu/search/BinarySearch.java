package com.atguigu.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//注意：使用二分查找的前提是 该数组是有序的.
public class BinarySearch {

	@Test
	public void test(){
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };
		System.out.println(binarySearch(arr,10));
	}

	// 二分查找算法
	/**
	 * 
	 * @param arr
	 *            数组
	 * @param left
	 *            左边的索引
	 * @param right
	 *            右边的索引
	 * @param findVal
	 *            要查找的值
	 * @return 如果找到就返回下标，如果没有找到，就返回 -1
	 */
	public  int binarySearch2(int[] arr, int left, int right, int findVal) {

		// 当 left > right 时，说明递归整个数组，但是没有找到
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		int midVal = arr[mid];

		if (findVal > midVal) { // 向 右递归
			return binarySearch2(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) { // 向左递归
			return binarySearch2(arr, left, mid - 1, findVal);
		} else {
			
			return mid;
		}

	}

	public int binarySearch(int[] arr,int findVal){

		int low =0;
		int high=arr.length-1;
		while (low<=high){
			int mid=low+(high-low)>>1;
			if(arr[mid]==findVal){
				return mid;
			}
			int midVal=arr[mid];
			if(midVal>findVal){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return -1;
	}



}
