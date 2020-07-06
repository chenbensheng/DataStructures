package com.array;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/2 15:09
 *
 * 最长回文子串
 * 回文，简单来说就是前后对称 比如123321
 */
public class longestPalind {
    public static void main(String[] args) {

    }

    /**
     * 动态规划思想  填表
     * 时间复杂度--O(n2)  空间复杂度--O(n2)
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int len= s.length();
        if(len<=1){
           return s;
        }
        int maxLen = 1;
        int begin=0;
        //dp[i][j] 标识s[i...j] 是否是回文串
        boolean[][] dp=new boolean[len][len];
        for (int i = 0; i < len ; i++) {
            dp[i][i]=true;
        }
        char[] charArray=s.toCharArray();
        //注意: 左下角先填
        for (int j = 1; j < len ; j++) {

            for (int i = 0; i < j ; i++) {

                if(charArray[i]!=charArray[j]){
                   dp[i][j]=false;
                }else{
                    if(j-i<=2){
                      dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                //如果dp[i][j]=true 表示子串是回文
                if(dp[i][j]&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
