package com.array;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/6 19:47
 * nums = [3,2,2,3], val = 3,
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[]  nums =new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return  i;
    }

    /**
     * 输入: [1,1,0,1,1,1]
     * 输出: 3
     */
    public int findMaxConsecutiveOnes(int[] nums) {

        int count =0;
        int maxCount=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count+=1;
            }else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        }
        return  Math.max(maxCount,count);
    }

    /**
     * 输入：s = 7, nums = [2,3,1,2,4,3]
     * 输出：2
     * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
     * 滑动窗口
     */
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int sum = 0;
        int len = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                len = len == 0 ? right - left + 1:Math.min(len, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return len;
    }
}
