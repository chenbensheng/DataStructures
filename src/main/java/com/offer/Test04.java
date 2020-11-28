package com.offer;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/11/27 17:26
 */
public class Test04 {
    public static void main(String[] args) {
        int[] a={1,2,4,4,5};
        System.out.println(upper_bound(5, 4, a));
    }

    public static int upper_bound(int n, int v, int[] a) {
        int left=0;
        int right=a.length;
        while(left<= right){
            int mid=((right-left)>>1)+left;
            if(a[mid]>=v){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        if(a[left]>=v){
            return left;
        }
        return a.length+1;
    }


}
