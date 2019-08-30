package com.atguigu.concurrent;

public class MyThread01 extends Thread {

    private Lock01 aaa;

    public  MyThread01(Lock01 aaa) {
        this.aaa = aaa;
    }

    public void run(){
        aaa.testMethod();
    }


    public static void main(String[] args) {

        Lock01 lock01=new Lock01();
        MyThread01 my01=new MyThread01(lock01);
        my01.start();
    }
}
