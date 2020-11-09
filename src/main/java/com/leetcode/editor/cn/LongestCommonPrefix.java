//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1310 👎 0

package com.leetcode.editor.cn;

public class LongestCommonPrefix{
   public static void main(String[] args) {
         Solution solution = new LongestCommonPrefix().new Solution();
       String[] strs={"leets","leetcode","leet","leeds"};
       System.out.println(solution.longestCommonPrefix(strs));

   }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
       /*
        方法1--纵向比较
        时间复杂度：O(mn)O(mn)，其中 mm 是字符串数组中的字符串的平均长度，nn 是字符串的数量。
        最坏情况下，字符串数组中的每个字符串的每个字符都会被比较一次。
        空间复杂度：O(1)。使用的额外空间复杂度为常数。
        */
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        int length =strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length ; i++) {
            char a = strs[0].charAt(i);
            for (int j = 1 ; j < count ; j++) {
                if(i==strs[j].length()||strs[j].charAt(i)!=a){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    //分治法
    public String longestCommonPrefix2(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }else{
            return commonPrefix2(strs,0,strs.length);
        }
    }

    public String commonPrefix2(String[] strs,int start,int end) {
        if(start==end){
            return strs[start];
        }else{
            int mid=(end-start)/2 + start;
            String lcpLeft= commonPrefix2(strs,start,mid);
            String lcpRight= commonPrefix2(strs,mid,end);
            return commonPrefix(lcpLeft,lcpRight);
        }
    }

    public String commonPrefix(String lcpLeft,String  lcpRight) {
        int minLength = Math.min(lcpLeft.length(),lcpRight.length());
        for (int i = 0; i < minLength ; i++) {
            if(lcpLeft.charAt(i)!=lcpRight.charAt(i)){
                return lcpLeft.substring(0,i);
            }
        }
        return lcpLeft.substring(0,minLength);
    }

   }
//leetcode submit region end(Prohibit modification and deletion)

}