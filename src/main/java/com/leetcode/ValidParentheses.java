package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/** 第20题--https://leetcode-cn.com/problems/valid-parentheses/
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class ValidParentheses {

    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}');
        put('[',']');
        put('(',')');
        put('?','?');
    }};


    public static void main(String[] args) {
        String s="()[[]]{}";
        System.out.println(isValid(s));
    }

    /*public static boolean isValid(String s){
        int length;
        do {
            length = s.length();
            s.replace("()","").replace("[]","").replace("{}","");
        }while (length!=s.length());
        return s.length()==0;
    }*/

    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(c==')'&& stack.peek()=='('||
                        c==']'&& stack.peek()=='['||
                        c=='}'&& stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
