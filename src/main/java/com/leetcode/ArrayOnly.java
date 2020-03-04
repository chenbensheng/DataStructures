package com.leetcode;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class ArrayOnly {

    public static void main(String[] args) {
        int[] arr ={1,1,2,4,4};
        //FindNumsAppearOnce(arr);
        FindNumsOnce(arr);
    }

    /**
     * 两个相同数字异或=0，一个数和0异或还是它本身。
     * 一个整型数组里1个数字出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
     */
    public static void FindNumsOnce(int [] array) {

        int xor1 = 0;
        for(int i=0; i < array.length; i++){
            xor1 ^= array[i];
        }
        System.out.println(xor1);
    }

    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    public static void FindNumsAppearOnce(int [] array) {

        int xor1 = 0;
        for(int i=0; i < array.length; i++){
            xor1 = xor1^array[i];
        }
        //在xor1中找到第一个不同的位对数据进行分类，分类为两个队列对数据进行异或求和找到我们想要的结果
        int index = 1;
        while((index & xor1)==0)
            index = index <<1;//因为可能有多个位为1所以需要求一下位置
        int result1 = 0;
        int result2 = 0;
        for(int i=0; i < array.length; i++){
            if((index & array[i]) == 0)
                result1 = result1^array[i];
            else
                result2 = result2^array[i];
        }
        System.out.println(result1);
        System.out.println(result2);
    }

}
