package com.test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/10/16 10:05
 */
public class Test0001 {

    public static void main(String[] args) {
        // 新建Person对象，
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);

        System.out.println(p1.equals(p2));   //true
        System.out.println(p1.hashCode());          // 29791
        System.out.println(p2.hashCode());       // 29791
        HashMap<Person, String> map = new HashMap<>();
        map.put(p1,"123");
        map.put(p2,"456");
        System.out.println(map.get(p1));   //123
        System.out.println(map.get(p2)); //456

        // 新建HashSet对象
        /*HashSet set = new HashSet();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        // 比较p1 和 p2， 并打印它们的hashCode()
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        // 比较p1 和 p4， 并打印它们的hashCode()
        System.out.printf("p1.equals(p4) : %s; p1(%d) p4(%d)\n", p1.equals(p4), p1.hashCode(), p4.hashCode());
        */
    }
}
