/**
https://oj.leetcode.com/problems/valid-parentheses/

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

**/

public class Solution {
    StringBuilder stack = new StringBuilder();

    public char pop() {
        int last = stack.length() -1;
        char ch = stack.charAt(last);
        stack.setLength(last);
        return ch;
    }

    public boolean isValid(String s) {
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.append(c);
            } else if (stack.length() > 0) {
                if (c == ')') {
                    if (pop() != '(') return false;
                } else if (c == '}'){
                    if (pop() != '{') return false;
                } else if (c == ']'){
                    if (pop() != '[') return false;
                }
            } else {
                return false;
            }
        }
        return stack.length() == 0;
    }
}
