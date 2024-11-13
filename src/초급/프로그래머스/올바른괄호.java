package 초급.프로그래머스;

import java.util.ArrayDeque;

/**
 * 프로그래머스 level 2 - 올바른 괄호
 */
public class 올바른괄호 {
	public static void main(String[] args) {
		boolean solution = solution("(())()(()())((()))()()()()()((((()))))");
		System.out.println("solution = " + solution);
	}

	public static boolean solution(String s) {
		if (!s.startsWith("(") || !s.endsWith(")")) {
			return false;
		}

		int count = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				count++;
			} else {
				count--;
				if (count < 0) {
					return false;
				}
			}
		}

		return count == 0;
	}

	public static boolean solution2(String s) {
		ArrayDeque<Character> stack = new ArrayDeque<>();

		char[] a = s.toCharArray();

		for (char c : a) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty() || stack.pop() == c) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
