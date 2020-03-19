package com.java8;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        Integer value1 = null;

        Optional<Integer> a = Optional.ofNullable(value1);

        System.out.println(a.isPresent());

    }
}
