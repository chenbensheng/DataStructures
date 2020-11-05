package com.offer;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/10/10 17:46
 */
public class Test11 {
    public static void main(String[] args) {
        int n =00000000000000000000000000001011;
        hammingWeight(n);
    }

    public static  int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }
}
