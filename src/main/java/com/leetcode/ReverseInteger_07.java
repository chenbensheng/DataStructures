package com.leetcode;

public class ReverseInteger_07 {

    public static void main(String[] args) {
        ReverseInteger_07 reverseInteger_07=new ReverseInteger_07();
        System.out.println(reverseInteger_07.reverse(-654321));
    }

    public int reverse(int x){
        boolean flag=true;
        if(x<0){
            x=-x;

            flag=false;
        }
        if(x==0){
            return 0;
        }
        while(x%10 == 0){
            x /= 10;
        }
        long result=0;
        while(x>0){
            result=result*10+x%10;
            if(result>Integer.MAX_VALUE){
                return 0;
            }
            x/=10;
        }
        if(flag){
            return (int)result;
        }else{
            return -(int)result;
        }
    }
}
