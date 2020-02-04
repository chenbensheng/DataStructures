package com.jike;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ªÒ»°
 */
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task=new FutureTask<String>(new MyCallable());
        new Thread(task).start();
        if (!task.isDone()){
            System.out.println("aaaa");
        }
        System.out.println("bbbb"+task.get());
    }
}
