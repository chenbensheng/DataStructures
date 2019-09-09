package com.atguigu.sort;

import java.util.Arrays;

/**
 *
 * Author:   chenbensheng
 * Date:     2019/6/17 15:31
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        insert(arr);
    }

    public static void insert(int[] arrays) {
        int temp;

        //外层循环控制需要排序的趟数(从1开始因为将第0位看成了有序数据)
        for (int i = 1; i < arrays.length; i++) {
            temp = arrays[i];
            //如果前一位(已排序的数据)比当前数据要大，那么就进入循环比较[参考第二趟排序]
            while (i >= 1 && arrays[i - 1] > temp) {
                //往后退一个位置，让当前数据与之前前位进行比较
                arrays[i] = arrays[i - 1];
                //不断往前，直到退出循环
                i--;
            }

            //退出了循环说明找到了合适的位置了，将当前数据插入合适的位置中
            arrays[i] = temp;
            System.out.println("第" + i + "轮插入");
            System.out.println(Arrays.toString(arrays));

        }

    }
}
