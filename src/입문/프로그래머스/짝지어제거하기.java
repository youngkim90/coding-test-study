package 입문.프로그래머스;

import java.util.ArrayDeque;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "baabaa";
		int result = solution(s);
		System.out.println("result = " + result);
	}

	private static int solution(String s) {
		ArrayDeque<Character> stack = new ArrayDeque<>();
		char[] charArray = s.toCharArray();

		for (char c : charArray) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
