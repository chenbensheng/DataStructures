package com.test;


import java.util.concurrent.atomic.AtomicInteger;


public class TestApplication {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(4);
        System.out.println(atomicInteger.compareAndSet(4, 50));
        System.out.println(atomicInteger.incrementAndGet());
    }


}
