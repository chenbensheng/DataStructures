package com.test;

import com.alibaba.fastjson.JSON;
import com.app.Appconfig;
import com.app.Y;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {

    public static void main(String[] args) {

       /* AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(ac.getBean(Y.class));
        */
       final List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        System.out.println(JSON.toJSONString(list));
    }
}
