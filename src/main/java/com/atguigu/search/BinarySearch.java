package com.atguigu.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//ע�⣺ʹ�ö��ֲ��ҵ�ǰ���� �������������.
public class BinarySearch {

	@Test
	public void test(){
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };
		System.out.println(binarySearch(arr,10));
	}

	// ���ֲ����㷨
	/**
	 * 
	 * @param arr
	 *            ����
	 * @param left
	 *            ��ߵ�����
	 * @param right
	 *            �ұߵ�����
	 * @param findVal
	 *            Ҫ���ҵ�ֵ
	 * @return ����ҵ��ͷ����±꣬���û���ҵ����ͷ��� -1
	 */
	public  int binarySearch2(int[] arr, int left, int right, int findVal) {

		// �� left > right ʱ��˵���ݹ��������飬����û���ҵ�
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		int midVal = arr[mid];

		if (findVal > midVal) { // �� �ҵݹ�
			return binarySearch2(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) { // ����ݹ�
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
