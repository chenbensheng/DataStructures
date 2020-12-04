package com.leetcode;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/12/4 13:52
 */
public class Power_50 {
    public static void main(String[] args) {

    }

    public double pow(double x, int n) {
        if(n>=0){
            return helper(x,n);
        }else{
            return 1/helper(x,-n);
        }
    }

    public double helper(double x, int n) {
        if(n==0){
            return 1;
        }
        double halfRes=helper(x,n/2);
        if(n%2==0){
           return halfRes*halfRes;
        }else{
            return halfRes*halfRes*x;
        }

    }

}
