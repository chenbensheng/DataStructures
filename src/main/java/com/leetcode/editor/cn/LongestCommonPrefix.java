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
        纵向比较
        时间复杂度：O(mn)O(mn)，其中 mm 是字符串数组中的字符串的平均长度，nn 是字符串的数量。
        最坏情况下，字符串数组中的每个字符串的每个字符都会被比较一次。
        空间复杂度：O(1)O(1)。使用的额外空间复杂度为常数。
        */
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        int length=strs[0].length();
        int count=strs.length;
        for (int i = 0; i <length ; i++) {
            char a=strs[0].charAt(i);
            for (int j = 1; j <count ; j++) {
                //第几个最长公共子串==下面的字符串长度
                if(i==strs[j].length()||a!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}