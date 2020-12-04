package com.sort;

/**
 * ����������ʾ
 * @author Lvan
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    /**
     * @param arr        ��������
     * @param leftIndex  ����������ʼλ��
     * @param rightIndex �������н���λ��
     */
    private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;
        int right = rightIndex;
        //������ĵ�һ��Ԫ����Ϊ��׼ֵ
        int key = arr[left];

        //���������߽���ɨ�裬ֱ��left = right
        while (left < right) {
            while (right > left && arr[right] >= key) {
                //��������ɨ�裬�ҵ���һ���Ȼ�׼ֵС��Ԫ��
                right--;
            }

            //�ҵ�����Ԫ�ؽ�arr[right]����arr[left]��
            arr[left] = arr[right];

            while (left < right && arr[left] <= key) {
                //��������ɨ�裬�ҵ���һ���Ȼ�׼ֵ���Ԫ��
                left++;
            }

            //�ҵ�����Ԫ�ؽ�arr[left]����arr[right]��
            arr[right] = arr[left];
        }
        //��׼ֵ��λ
        arr[left] = key;
        //�Ի�׼ֵ��ߵ�Ԫ�ؽ��еݹ�����
        quickSort(arr, leftIndex, left - 1);
        //�Ի�׼ֵ�ұߵ�Ԫ�ؽ��еݹ�����
        quickSort(arr, right + 1, rightIndex);
    }
}