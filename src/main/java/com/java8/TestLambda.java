package com.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestLambda {


    @Test
    public void testPre(){

        List<Integer> l = Arrays.asList(102,111,11,10,8,888);
        List<Integer> list=filterInt(l,x->x>100);
        for (Integer i: list) {
            System.out.println(i);
        }
    }

    public List<Integer> filterInt(List<Integer> sum, Predicate<Integer> pre){
        List<Integer> list= new ArrayList<>();
        for (Integer integer : sum) {
            if(pre.test(integer)){
                list.add(integer);
            }
        }
        return list;
    }

    @Test
    public void testSupplier(){
        List<Integer> list= getNumList(10, ()->(int)(Math.random()*100));
        for (Integer i: list) {
            System.out.println(i);
        }
    }

    public List<Integer> getNumList(int sum, Supplier<Integer> sup){
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < sum ; i++) {
            list.add(sup.get());
        }
        return list;
    }
}
