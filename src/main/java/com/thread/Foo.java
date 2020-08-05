package com.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/9 17:49
 */
public class Foo {
     private CountDownLatch countDownLatch01;
     private CountDownLatch countDownLatch02;

    public Foo() {
        countDownLatch01=new CountDownLatch(1);
        countDownLatch02=new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        countDownLatch01.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        countDownLatch01.await();
        printSecond.run();
        countDownLatch02.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        countDownLatch02.await();
        printThird.run();
    }

    public static void main(String[] args) {
        Foo threadTest = new Foo();

        new Thread(()->{
            try {
                threadTest.second(()->{
                    System.out.println("second");

                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                threadTest.third(()->{
                    System.out.println("third");

                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                threadTest.first(()->{
                    System.out.println("one");

                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

}
