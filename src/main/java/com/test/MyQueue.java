package com.test;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List list = new ArrayList();

    public void push(Object o){
        list.add(o);
    }
    //����
    public void pop(){
        Object o=null;
        if(!list.isEmpty()){
            for (Object obj : list) {
                System.out.println(obj);
            }
        }else{
            return;
        }
    }
    //��ȡ���г���
    public int getMyQueueLength(){
        return list.size();
    }
    //�ж϶����Ƿ�δ��
    public boolean isMyQueueEmpty(){
        return list.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.push("1");
        myQueue.push("2");
        myQueue.push("3");
        myQueue.pop();
    }
}
