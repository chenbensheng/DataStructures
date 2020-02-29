package com.jike;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {3, -1, 2, 8, 4, 5, 10, 1};
        int max = arr[0];
        int second = arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else {
                if (arr[i] > second) {
                    second = arr[i];
                }
            }

        }
        System.out.println(second);
    }

    //要高效的从给定数组中找出第m大的数字，应该怎样做？

}
