package com.atguigu.sort;

import java.util.Arrays;

/**
 *
 * Author:   chenbensheng
 * Date:     2019/6/17 15:31
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        insert(arr);
    }

    public static void insert(int[] arrays) {
        int temp;

        //���ѭ��������Ҫ���������(��1��ʼ��Ϊ����0λ��������������)
        for (int i = 1; i < arrays.length; i++) {
            temp = arrays[i];
            //���ǰһλ(�����������)�ȵ�ǰ����Ҫ����ô�ͽ���ѭ���Ƚ�[�ο��ڶ�������]
            while (i >= 1 && arrays[i - 1] > temp) {
                //������һ��λ�ã��õ�ǰ������֮ǰǰλ���бȽ�
                arrays[i] = arrays[i - 1];
                //������ǰ��ֱ���˳�ѭ��
                i--;
            }

            //�˳���ѭ��˵���ҵ��˺��ʵ�λ���ˣ�����ǰ���ݲ�����ʵ�λ����
            arrays[i] = temp;
            System.out.println("��" + i + "�ֲ���");
            System.out.println(Arrays.toString(arrays));

        }

    }
}
