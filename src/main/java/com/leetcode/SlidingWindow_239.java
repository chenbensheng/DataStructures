package com.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ����һ������ nums����һ����СΪ?k?�Ļ������ڴ������������ƶ�����������Ҳࡣ
 * ��ֻ���Կ����ڻ��������ڵ� k�����֡���������ÿ��ֻ�����ƶ�һλ��
 * ���ػ��������е����ֵ
 * ����: nums = [1,3,-1,-3,5,3,6,7], �� k = 3
 * ���: [3,3,5,5,6,7]
 */
public class SlidingWindow_239 {

    @Test
    public void test() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(JSONObject.toJSONString(maxSlidingWindow(nums, 3)));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0) return new int[0];
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < nums.length; i++) {
            // ÿ����������ʱ��������ֶ���ͷ���������±꣬�Ǵ�������������±꣬���ӵ�
            if (!deque.isEmpty() && deque.peekFirst() == i - k) deque.poll();
            // �Ѷ���β�����б�����С�Ķ��ӵ�����֤�����ǽ����
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.removeLast();
            // ��������
            deque.offerLast(i);
            // ����ͷ�����Ǹô����ڵ�һ���
            if ((i + 1) >= k) {
                res[i + 1 - k] = nums[deque.peek()];
            }
        }
        return res;
    }
}
