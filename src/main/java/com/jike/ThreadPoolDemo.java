package com.jike;

import java.util.concurrent.*;

/**
 * 如何实现处理线程的返回值？
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        Future<String> future = newFixedThreadPool.submit(new MyCallable());
        if(!future.isDone()){
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
