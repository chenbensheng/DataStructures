package com.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/1 19:19
 *
 * 先将目标区间数组从小到大排序，然后从第一个区间开始，如果相邻的两个区间，end小于start则合并区间，且生成新的区间，如果不小于，则放到返回区间，可以看下面几个例子。
 *
 * [1,3][2,6] ->[1,6]
 *
 * 第一个区间的end大于等于第二个区间的start,同时第二个区间的end大于第一个区间的end。
 *
 * [2,8][3,5] ->[2,8]
 *
 * 第一个区间的end大于等于第二个区间的start,同时第二个区间的end小于第一个区间的end。
 *
 * [1,2][3,4] -> [1,2][3,4]
 *
 * 第一个区间的end小于第二个区间的start 。
 */
public class MerageArray {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merge =merge(intervals);
        System.out.println(JSON.toJSONString(merge));
    }

    public static  int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (len < 2) {
            return intervals;
        }
        // 也可以使用 Stack，因为我们只关心结果集的最后一个区间
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int i = 1; i < len; i++) {
            int[] curInterval = intervals[i];

            // 每次新遍历到的列表与当前结果集中的最后一个区间的末尾端点进行比较
            int[] peek = res.get(res.size() - 1);

            if (curInterval[0] > peek[1]) {
                res.add(curInterval);
            } else {
                // 注意，这里应该取最大
                peek[1] = Math.max(curInterval[1], peek[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }


    }
