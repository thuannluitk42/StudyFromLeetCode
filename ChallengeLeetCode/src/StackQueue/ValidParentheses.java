package StackQueue;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char openPeek = stack.peek();
				if (c == ')' && openPeek == '(' || c == ']' && openPeek == '[' || c == '}' && openPeek == '{') {
					return true;
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty() ? true : false;
	}
}
