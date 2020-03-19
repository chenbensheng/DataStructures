package com.leetcode;

import java.util.PriorityQueue;

/**
 * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 * 用PriorityQueue实现最小堆
 */
public class Klargest_703 {
    //java 优先队列每次取都是最小元素 只存放前k大的元素
    final PriorityQueue<Integer> q;
    final int k;

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2};
        Klargest_703 kthLargest = new Klargest_703(3, arr);
        //System.out.println(kthLargest.add(3));
        //System.out.println(kthLargest.add(30));
        System.out.println(kthLargest.get());
    }


    public Klargest_703(int k, int[] nums) {
        this.k = k;
        this.q = new PriorityQueue<Integer>(k);
        for (int n : nums) {
            if (q.size() < k) {
                q.offer(n);
            } else if (q.peek() < n) {
                q.poll();
                q.offer(n);
            }
            ;
        }
    }

    public int get() {
        return q.peek();
    }

    /**
     * peek()  获取队首的元素，但不从队列中移除
     * poll()  获取队首的元素，并从队列中移除
     * offer() 添加一个元素到队尾
     * @param n
     * @return
     */
    public int add(int n) {
        if (q.size() < k) {
            q.offer(n);
        } else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }
}
