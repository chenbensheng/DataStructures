package com.atguigu.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort2 {

    @Test
    public void test(){
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("����ǰ");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);

        System.out.println("�����");
        System.out.println(Arrays.toString(arr));
    }



    public void bubbleSort(int[] arr){
        int temp=0;
        //Ĭ�϶��������~
        boolean flag=false;
        int lastExchangeIndex = 0;
        int unorderedBorder = arr.length-1;
        for (int i = 0; i <arr.length-1 ; i++) {

            for (int j = 0; j <unorderedBorder ; j++) {
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //��¼�����һ�ν���Ԫ�ص�λ��
                    lastExchangeIndex=j;
                }
            }
            unorderedBorder=lastExchangeIndex;
            //flag=false ˵��û�н�����
            if(!flag){
                break;
            }
        }
    }
}
