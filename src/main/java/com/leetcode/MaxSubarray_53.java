package com.leetcode;

/**
 * 最大子序和
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 * 贪心算法
 * 时间复杂度：\mathcal{O}(N)O(N)。只遍历一次数组。
 * 空间复杂度：\mathcal{O}(1)O(1)，只使用了常数空间
 */
public class MaxSubarray_53 {
    public static void main(String[] args) {
        int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {

        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
          if(curSum<0){
             curSum=nums[i];
          }else{
              curSum+=nums[i];
          }

          if(curSum>maxSum){
              maxSum=curSum;
          }
        }
        return maxSum;
    }
}
