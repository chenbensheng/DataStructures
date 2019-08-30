package com.atguigu.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock01 {

    private Lock lock=new ReentrantLock();

    public void testMethod(){

        try {
            lock.lock();
            System.out.println("ThreadName"+Thread.currentThread().getName());
        }finally {
            lock.unlock();
        }
    }

}
