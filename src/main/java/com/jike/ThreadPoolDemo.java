package com.jike;

import java.util.concurrent.*;

/**
 * ���ʵ�ִ����̵߳ķ���ֵ��
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        Future<String> future = newFixedThreadPool.submit(new MyCallable());
        if (!future.isDone()) {
            System.out.println("task---");
        }
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
