package com.atguigu.linkedlist;

import java.util.LinkedList;

/**
 * Author:   chenbensheng
 * Date:     2019/6/12 18:48
 */
public class Josepfu2 {


    public static void main(String[] args) {
        Integer total = 5;
        Integer keyNumber = 2;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < total; i++) {
            list.addLast(i+1);
        }
        int index = 0;
        while (list.size() > 1) {
            for (int i = 1; i < keyNumber; i++) {
                if (index == list.size() - 1) {
                    index = 0;
                } else {
                    index++;
                }
            }
            list.remove(index);
            System.out.printf("小孩%d出圈\n",index+1);
        }
        System.out.println(total + "个人围成一圈数数，数到" + keyNumber + "的被淘汰，最后剩下的是第" + list.get(0) + "个人。");
    }

}
