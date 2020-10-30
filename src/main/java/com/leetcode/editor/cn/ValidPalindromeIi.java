//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 示例 1: 
//
// 
//输入: "aba"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "abca"
//输出: True
//解释: 你可以删除c字符。
// 
//
// 注意: 
//
// 
// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。 
// 
// Related Topics 字符串 
// 👍 279 👎 0

package com.leetcode.editor.cn;

public class ValidPalindromeIi{
   public static void main(String[] args) {
         Solution solution = new ValidPalindromeIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        int begin=0;
        int end = s.length()-1;
        while(begin<end){
            if(s.charAt(begin)!=s.charAt(end)){
                return isPalind(s,begin+1,end)||isPalind(s,begin,end-1);
            }
            begin++;
            end--;
        }
        return true;
    }

    public boolean isPalind(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}