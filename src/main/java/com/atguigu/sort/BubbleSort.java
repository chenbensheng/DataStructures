package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


/**
 * ʱ�临�Ӷ�ΪO(n^2)���ռ临�Ӷ�ΪO(1)��
 * �Ż�ð������https://www.cnblogs.com/9dragon/p/10705097.html
 */
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3, 9, -1, 10, 20};
		System.out.println("����ǰ");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);

		System.out.println("�����");
		System.out.println(Arrays.toString(arr));

		
	}
	
	// ��ǰ���ð�������㷨����װ��һ������
	public static void bubbleSort(int[] arr) {

		int lastExchIndex=0;
		//����߽磬ÿ�αȽϱȵ�����Ϳ�����
		int sortBorder=arr.length-1;

		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = true; // ��ʶ��������ʾ�Ƿ���й�����
			int temp = 0; // ��ʱ����
			for (int j = 0; j < sortBorder; j++) {
				// ���ǰ������Ⱥ���������򽻻�
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
					//�������һ�ν�����λ��
					lastExchIndex=j;
				}
			}
			sortBorder=lastExchIndex;
			if(flag){
				break;
			}

			System.out.println("��" + (i + 1) + "������������");
			System.out.println(Arrays.toString(arr));

		}
	}

}
