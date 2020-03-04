package com.leetcode;

import java.util.Arrays;

/** 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *  删除排序数组中的重复项
 * 可以用两个指针front和back来实现：
 * 如果back与front正好重复了，拉动front，直到back和front不重复为止
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
