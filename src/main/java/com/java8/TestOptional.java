package com.java8;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

public class TestOptional {

    public static void main(String[] args) {
        Integer value1 = null;

        Optional<Integer> a = Optional.ofNullable(value1);

        System.out.println(a.isPresent());

    }

    @Test
    public void whenCheckIfPresent_thenOk() {
        Employee user = new Employee(11, "1234");
        Optional<Employee> opt = Optional.ofNullable(user);
        assertTrue(opt.isPresent());
    }


    @Test
    public void test2(){
        Optional<Employee> op = Optional.ofNullable( new Employee() );

        Employee emp = op.get();
        System.out.println(emp);
    }

    @Test
    public void test1(){
        Optional<Employee> op = Optional.of(null);

        Employee emp = op.get();
        System.out.println(emp);
    }

}
