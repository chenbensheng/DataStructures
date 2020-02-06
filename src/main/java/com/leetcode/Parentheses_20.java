package com.leetcode;

import java.util.Stack;

public class Parentheses_20 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s){
        Stack<Character> stack =new Stack<>();
        char[] chars= s.toCharArray();
        for (char c: chars) {
            if(stack.size()==0){
                stack.push(c);
            }else {
                char c1=stack.peek();
                boolean ss= (c1=='('&& c==')')||
                        (c1=='['&& c==']')||
                        (c1=='{'&& c=='}');
                if(ss){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        if(stack.size()==0){
            return true;
        }else {
            return false;
        }
    }
}
