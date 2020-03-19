package com.leetcode;

import java.util.PriorityQueue;

/**
 * ���һ���ҵ��������е�K��Ԫ�ص��ࣨclass����ע���������ĵ�K��Ԫ�أ����ǵ�K����ͬ��Ԫ�ء�
 * ��PriorityQueueʵ����С��
 */
public class Klargest_703 {
    //java ���ȶ���ÿ��ȡ������СԪ�� ֻ���ǰk���Ԫ��
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
     * peek()  ��ȡ���׵�Ԫ�أ������Ӷ������Ƴ�
     * poll()  ��ȡ���׵�Ԫ�أ����Ӷ������Ƴ�
     * offer() ���һ��Ԫ�ص���β
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
