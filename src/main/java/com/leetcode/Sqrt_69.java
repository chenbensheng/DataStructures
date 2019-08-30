package com.leetcode;

public class Sqrt_69 {
    public static void main(String[] args) {
        Sqrt_69 sqrt_69=new Sqrt_69();
        System.out.println(sqrt_69.mySqrt(2147395599));
    }

    /**
     * 一个数的平方根肯定不会超过它自己，不过直觉还告诉我们，一个数的平方根最多不会超过它的一半，例如 88 的平方根，88 的一半是 44，4^2=16>84
     * 意即：如果一个数的一半的平方大于它自己，那么这个数的取值范围。解以上不等式得 a \ge 4a≥4 或者 a \le 0a≤0
     *
     */
    public int mySqrt(int x){
        int left=0;
        int right=x/2+1;

        while (left<right){
            //>>>表示不带符号向右移动二进制数，移动后前面统统补0；两个箭头表示带符号移动，
            int mid=(left+right+1)>>>1;
            int square=mid*mid;
            if(square>x){
                right=mid-1;
            }else {
                left=mid;
            }
        }
        return  left;
    }

}
