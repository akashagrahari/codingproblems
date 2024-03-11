package stack;

import java.util.Stack;

/**
 *
 * https://leetcode.com/problems/valid-parentheses/
 */

public class ValidParenthesis {
    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid("()[]{}"));
        System.out.println(validParenthesis.isValid("()]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(isOpeningBracket(ch)) {
                stack.push(ch);
            } else if(stack.size() != 0) {
                char topOfStackCh = stack.peek();
                if(isComplementaryParenthesis(ch, topOfStackCh)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }

    private boolean isComplementaryParenthesis(char ch, char topOfStackCh) {
        return (topOfStackCh == '(' && ch == ')') || (topOfStackCh == '{' && ch == '}') || (topOfStackCh == '[' && ch == ']');
    }

    private boolean isOpeningBracket(char ch) {
        return (ch == '(' || ch == '{' || ch == '[');
    }

    public boolean isValidTemp(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if (ch == ')') {
                if (stack.size()!= 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (ch == '}') {
                if (stack.size()!= 0 && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (ch == ']') {
                if (stack.size()!= 0 && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
}
