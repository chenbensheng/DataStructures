//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 数学 字符串 
// 👍 498 👎 0

package com.leetcode.editor.cn;

public class AddBinary{
   public static void main(String[] args) {
         Solution solution = new AddBinary().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public String addBinary(String a, String b) {
        if(a.length()>b.length()){
            b='0'+b;
        }
        if(a.length() < b.length()){
            a='0'+a;
        }
        int[] res = new int[a.length()];
        int sum =0;
        int carry=0; //进位
        for (int i = a.length()-1; i >=0 ; i--) {
            sum = (int)a.charAt(i) + (int)b.charAt(i) + carry;
            if(sum>=2){
                res[i]=sum-2;
                carry=1;
            }else{
                res[i]=sum;
                carry =0;
            }
        }
        return res.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}