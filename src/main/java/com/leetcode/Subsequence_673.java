package com.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/8/5 18:25
 * dp[i] 表⽰以 nums[i] 这个数结尾的最⻓递增⼦序列的⻓度
 */
public class Subsequence_673 {
    public static void main(String[] args) {
        int[] nums={1,3,5,4,7};
        System.out.println(findNumberOfLIS2(nums));
        //System.out.println(findLengthOfLCIS(nums));
    }

    /**
     * 最长递增子序列(非连续)
     * @param nums
     */
    public static int findNumberOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        //dp 数组全部初始化为1
        Arrays.fill(dp,1);
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <i ; j++) {
                //子序列比较
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        System.out.println(JSON.toJSONString(dp));
        int res=0;
        for (int i = 0; i <dp.length ; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }


    public static int findNumberOfLIS2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        //dp[i] 表⽰以 nums[i] 这个数结尾的最⻓递增⼦序列的⻓度
        int[] dp = new int[n];
        //统计最长递增序列的个数,准备长度nn的数组countercounter
        int[] counter = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(counter, 1);

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                        counter[i] = counter[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        counter[i] += counter[j];
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) res += counter[i];
        }
        return res;

    }
    /**
     *  最长连续递增序列是 [1,3,5,4], 长度为3。
     * @param nums
     */
    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        //dp 数组全部初始化为1
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;

                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }

    public static int findLengthOfLCIS2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //使用point变量表示以当前值结尾的连续递增序列的长度
        int point = 1,max=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                point++;
            }else {
                point=1;
            }
            if(point>max){
                max = point;
            }
        }
        return max;
    }



}
