package com.leetcode;

public class Power_50 {

    public static void main(String[] args) {
        System.out.println(quickMul(2, 10));
    }



    public static double quickMul(double x, long N) {
        double ans = 1.0;
        while (N > 0) {
            //奇数 多一个x
            if ((N & 1) ==1) {
                ans=ans * x;
            }
            x *= x;
            //右移一位  折半
            N >>= 1;
        }
        return ans;
    }



    //递归---分治实现
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return  1/myPow(x,-n);
        }
        if(n%2==1){
            return x*myPow(x,n-1);
        }else {
           return myPow(x*x,n/2);
        }
    }
    public static double myPow2(double x, int n) {
      if(n<0){
        x=1/x;
        n=-n;
      }
     return fastPow(x,n);
    }

    private static double fastPow(double x,long n){
        if(n==0){
            return 1.0;
        }
        double half=fastPow(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
}
