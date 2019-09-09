package com.leetcode;

import org.junit.Test;

import java.util.HashMap;

/**
 * 有n步台阶，一次只能上1步或者2步，一共有多少种走法
 */
public class TestStep {

    @Test
    public void test(){
        long start=System.currentTimeMillis();
        System.out.println(f2(50));
        //System.out.println(loop(10));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    /**
     * 递归
     * @param n
     * @return
     */
    public int f(int n){
        if(n<1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if(n==1||n==2){
            return n;
        }
        return f(n-2)+f(n-1);
    }

    /**
     * 递归--加HashMap 避免重复计算
     * @param n
     * @return
     */
    public long f2(int n){
        if(n<1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if(n==1||n==2){
            return n;
        }
        HashMap<Integer,Long> hashMap=new HashMap();
        if(hashMap.containsKey(n)){
         return  hashMap.get(n);
        }
        long nn=f(n-2)+f(n-1);
        hashMap.put(n,nn);
        return nn;
    }

    /**
     * 迭代循环
     * @param n
     * @return
     */
    public long loop(int n){
        if(n==1||n==2){
            return n;
        }
        //初始化为走到第2级台阶的走法
        long one=2;
        //初始化为走到第1级台阶的走法
        long two=1;
        long sum=0;
        for (int i = 3; i <n ; i++) {
            //最后跨2步+最后跨1步的走法
            sum=two+one;
            two=one;
            one=sum;
        }
        return sum;
    }
}
