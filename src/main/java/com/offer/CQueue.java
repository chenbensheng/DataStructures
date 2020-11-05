package com.offer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * @Author: chenbensheng
 * @CreateDate: 2020/10/10 17:24
 */
public class CQueue {

    //队列--先进先出 在栈B为空时，需要将A中的数据取出插入栈B中
    Stack<Integer> A,B;

    public CQueue() {
        A =new Stack<>();
        B =new Stack<>();
    }

    //在队列尾部插入整数
    public void appendTail(int value) {
      A.push(value);
    }

    //在队列头部删除整数
    public int deleteHead() {
        if(B.isEmpty()){
            if(A.isEmpty()){
                return -1;
            }
            while (!A.isEmpty()){
                B.push(A.pop());
            }
        }
       return B.pop();
    }
}
