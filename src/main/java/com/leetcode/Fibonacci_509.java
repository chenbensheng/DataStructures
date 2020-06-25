package com.leetcode;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/6/12 12:40
 */
public class Fibonacci_509 {

    public static void main(String[] args) {
        Fibonacci_509 fibonacci_509 =new Fibonacci_509();
        System.out.println(fibonacci_509.fib4(7));
    }
    /**
     *  方法一:递归  简单 暴力
     *  时间复杂度：O(2^n)
     *  空间复杂度：O(n)O
     */
    public int fib1(int n) {
        if (n <=2 ) {
            return n;
        }
        return fib1(n-1) + fib1(n-2);
    }


    /**
     *  方法二:自底向上的方法 或者同理--自顶向下方法
     *  时间复杂度：O(n)。
     *  空间复杂度：O(n)，使用了空间大小为 n 的数组。
     */
    public int fib2(int n){
        int[] F = new int[n + 1];
        F[1] = 1;
        F[2] = 2;
        for(int i = 3; i <= n; i++){
            F[i] = F[i-1] + F[i-2];
        }
        return F[n];
    }
    private Integer[] cache = new Integer[31];

    /**
     *  方法二:自顶向下方法
     *  时间复杂度：O(n)。
     *  空间复杂度：O(n)，使用了空间大小为 n 的数组。
     */
    public int fib(int N) {
        cache[0] = 1;
        cache[1] = 2;
        return memoize(N);
    }

    public int memoize(int N) {
        if (cache[N] != null) {
            return cache[N];
        }
        cache[N] = memoize(N-1) + memoize(N-2);
        return memoize(N);
    }


    /**
     *  方法三:循环迭代方法
     *  时间复杂度：O(n)
     *  空间复杂度：O(1)
     */
    public int fib3(int n) {
        int prev = 1,curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    /**
     *  方法四:矩阵快速求幂方法 --灵感来源:极客时间《算法面试通关40讲》--第61课
     *  两个矩阵的乘法：（矩阵相乘方法：http://www.ruanyifeng.com/blog/2015/09/matrix-multiplication.html）
     *  时间复杂度：O(logn)
     *  空间复杂度：O(logn)
     */
    int fib4(int n) {
        if (n <=2) {
            return n;
        }
        //单位矩阵
        int[][] result = {{1}, {0}};
        int[][] tem = {{1, 1}, {1, 0}};

        while (n != 0) {
            if ((n &1)  == 1) {
                result  = multiply(tem, result);
            }
            tem = multiply(tem, tem);
            //右移一位并赋值
            n >>= 1;
        }
        return  result[0][0];
    }

    //矩阵乘法 中为for循环嵌套，但是由于斐波那契数列为2*2矩阵，其循环次数一定，时间复杂度可看为O(1),
    private static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[i].length; k++) {
                    matrix[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return matrix;
    }

    

}
