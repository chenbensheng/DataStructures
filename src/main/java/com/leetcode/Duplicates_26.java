package com.leetcode;

import java.util.Arrays;

/** ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 *  ɾ�����������е��ظ���
 * ����������ָ��front��back��ʵ�֣�
 * ���back��front�����ظ��ˣ�����front��ֱ��back��front���ظ�Ϊֹ
 */
public class Duplicates_26 {

    public static void main(String[] args) {
        int[] nums= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int back=0;
        for (int front = 1; front < nums.length-1; front++) {
            if (nums[back]!=nums[front]){
                back++;
                nums[back]=nums[front];
            }

        }
        for (int i = 0; i < back+1; i++) {
            System.out.println(nums[i]);
        }
        return back+1;
    }
}
