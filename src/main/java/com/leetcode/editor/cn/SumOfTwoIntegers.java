//不使用运算符 + 和 - ，计算两整数 a 、b 之和。 
//
// 示例 1: 
//
// 输入: a = 1, b = 2
//输出: 3
// 
//
// 示例 2: 
//
// 输入: a = -2, b = 3
//输出: 1 
// Related Topics 位运算 
// 👍 324 👎 0

package com.leetcode.editor.cn;

public class SumOfTwoIntegers{
   public static void main(String[] args) {
       Solution solution = new SumOfTwoIntegers().new Solution();
       System.out.println(solution.getSum(5, 7));

   }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getSum(int a, int b) {

        while (b!=0){
            //不进位加法
            int _a =a^b;
            int _b=(a&b)<<1;
            a=_a;
            b=_b;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}