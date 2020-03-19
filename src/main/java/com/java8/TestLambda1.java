package com.java8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.JSONScanner;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambda1 {

    public static void main(String[] args) {
        String[] strs = {"java 8", "is", "easy", "to", "use"};
         Arrays.stream(strs)
                .flatMap(str -> Arrays.stream(str.split(" ")))  // 映射成为Stream<String[]>
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::print);


    }

    @Test
    public void test1(){
        List<String> list = Arrays.asList("beijing changcheng", "beijing gugong", "beijing tiantan", "gugong tiananmen");

        list.stream()
                .map(str-> str.split(" "))
                .forEach(System.out::println);


        list.stream()
                .flatMap(item -> Arrays.stream(item.split(" ")))
                .collect(Collectors.toList()).forEach(System.out::println);

    }

    @Test
    public void test2(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream()
                .forEach(System.out::print);
    }


}
