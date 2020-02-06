package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class window_239 {

    public static void main(String[] args) {
       int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        /** 队列第一个位置保存当前窗口的最大值。
         * 对新来的元素k，将其与双端队列中的元素相比较
         * 1）前面比k小的，直接移出队列（因为不再可能成为后面滑动窗口的最大值）
         * 2）前面比k大的X，比较两者下标，判断X是否已不在窗口之内，不在了，直接移出队列
         */
        if(nums==null||nums.length<2) return nums;
        int[] res = new int[nums.length-k+1];
        int count=0;

        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            //超出范围的去掉
            while (!queue.isEmpty() && i>=k && queue.peekLast() <= i-k)
                queue.pollLast();
            //当前值大于之前的值，之前的不可能是最大值，可以删掉
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekFirst()])
                queue.pollFirst();

            queue.offerFirst(i);
            if (i >= k - 1) { //此时开始是第一个滑动窗口
                res[count++]=nums[queue.peekLast()];
            }
        }
        return res;
    }
}
