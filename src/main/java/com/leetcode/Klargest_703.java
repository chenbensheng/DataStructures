package com.leetcode;

import java.util.PriorityQueue;

/**
 * ���һ���ҵ��������е�K��Ԫ�ص��ࣨclass����ע���������ĵ�K��Ԫ�أ����ǵ�K����ͬ��Ԫ�ء�
 * ��PriorityQueueʵ����С��
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
     * peek()//���ض���Ԫ��
     * poll()//���ض���Ԫ�أ�����Ԫ�س�����
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
