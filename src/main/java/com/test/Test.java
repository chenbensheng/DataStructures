package com.test;

import com.alibaba.fastjson.JSON;
import com.app.Appconfig;
import com.app.Y;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.*;


public class Test {

    public static void main(String[] args) {

       /* AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(ac.getBean(Y.class));
        */
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };
        System.out.println(binarySearch(arr,10));

    }

    public static int binarySearch(int [] arr,int findVal){
        int low =0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)>>1;
            if(arr[mid]==findVal){
                return mid;
            }
            int midVal=arr[mid];
            if(midVal>findVal){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;

    }
}
