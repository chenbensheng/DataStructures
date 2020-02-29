package com.leetcode;

public class Sqrt_69 {
    public static void main(String[] args) {
        Sqrt_69 sqrt_69 = new Sqrt_69();
        System.out.println(sqrt_69.mySqrt(2147395599));
    }

    /**
     * һ������ƽ�����϶����ᳬ�����Լ�������ֱ�����������ǣ�һ������ƽ������಻�ᳬ������һ�룬
     * ���� 88 ��ƽ������88 ��һ���� 44��4^2=16>84
     */
    public int mySqrt(int x) {
        long left = 0;
        long right = x / 2 + 1;

        while (left < right) {
            //>>>��ʾ�������������ƶ������������ƶ���ǰ��ͳͳ��0��������ͷ��ʾ�������ƶ���
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }

}
