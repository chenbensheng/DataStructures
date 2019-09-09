package com.leetcode;

import java.util.PriorityQueue;

/**
 * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 * 用PriorityQueue实现最小堆
 */
public class Klargest_703 {

    public static void main(String[] args) {
        int k = 3;
        int[] arr =  {4,5,8,2};
        Klargest_703 kthLargest = new Klargest_703(3, arr);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }

    final PriorityQueue<Integer> q;
    final int k;

    public Klargest_703(int k, int[] nums) {
       this.k=k;
       this.q=new PriorityQueue<Integer>(k);
       for (int n:nums){
           add(n);
       }
    }

    /**
     * peek()//返回队首元素
     * poll()//返回队首元素，队首元素出队列
     * @param n
     * @return
     */
    public int add(int n) {
        if(q.size()<k){
            q.offer(n);
        }else if(q.peek()<n){
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }
}
