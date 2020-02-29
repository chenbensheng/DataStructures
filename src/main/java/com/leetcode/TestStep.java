package com.leetcode;

import org.junit.Test;

import java.util.HashMap;

/**
 * ��n��̨�ף�һ��ֻ����1������2����һ���ж������߷�
 */
public class TestStep {

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        System.out.println(f2(50));
        //System.out.println(loop(10));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * �ݹ�
     *
     * @param n
     * @return
     */
    public int f(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n����С��1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 2) + f(n - 1);
    }

    /**
     * �ݹ�--��HashMap �����ظ�����
     *
     * @param n
     * @return
     */
    public long f2(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n����С��1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        HashMap<Integer, Long> hashMap = new HashMap();
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        }
        long nn = f(n - 2) + f(n - 1);
        hashMap.put(n, nn);
        return nn;
    }

    /**
     * ����ѭ��
     *
     * @param n
     * @return
     */
    public long loop(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        //��ʼ��Ϊ�ߵ���2��̨�׵��߷�
        long one = 2;
        //��ʼ��Ϊ�ߵ���1��̨�׵��߷�
        long two = 1;
        long sum = 0;
        for (int i = 3; i < n; i++) {
            //����2��+����1�����߷�
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }
}
