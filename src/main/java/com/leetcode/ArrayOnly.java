package com.leetcode;

/**
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 */
public class ArrayOnly {

    public static void main(String[] args) {
        int[] arr ={1,1,2,4,4};
        //FindNumsAppearOnce(arr);
        FindNumsOnce(arr);
    }

    /**
     * ������ͬ�������=0��һ������0�����������
     * һ������������1�����ֳ���һ�Σ����������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε�����
     */
    public static void FindNumsOnce(int [] array) {

        int xor1 = 0;
        for(int i=0; i < array.length; i++){
            xor1 ^= array[i];
        }
        System.out.println(xor1);
    }

    //һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
    public static void FindNumsAppearOnce(int [] array) {

        int xor1 = 0;
        for(int i=0; i < array.length; i++){
            xor1 = xor1^array[i];
        }
        //��xor1���ҵ���һ����ͬ��λ�����ݽ��з��࣬����Ϊ�������ж����ݽ����������ҵ�������Ҫ�Ľ��
        int index = 1;
        while((index & xor1)==0)
            index = index <<1;//��Ϊ�����ж��λΪ1������Ҫ��һ��λ��
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
