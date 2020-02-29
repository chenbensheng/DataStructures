package com.leetcode;

/** 删除排序数组中的重复项
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
        return back+1;
    }
}
