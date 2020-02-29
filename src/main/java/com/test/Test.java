package com.test;

import com.alibaba.fastjson.JSON;
import com.app.Appconfig;
import com.app.Y;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Test {

    public static void main(String[] args) {

       /* AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(ac.getBean(Y.class));
        */
        AtomicInteger atomicInteger = new AtomicInteger(4);
        System.out.println(atomicInteger.compareAndSet(4, 50));
        System.out.println(atomicInteger.incrementAndGet());
    }


}
