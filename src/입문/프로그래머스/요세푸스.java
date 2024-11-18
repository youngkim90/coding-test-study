package 입문.프로그래머스;

import java.util.ArrayDeque;

public class 요세푸스 {
	public static void main(String[] args) {
		int solution = solution(5, 3);
		System.out.println("solution = " + solution);
	}

	public static int solution(int n, int k) {
		ArrayDeque<Integer> queue = new ArrayDeque<>();

		for (int i = 1; i <= n; i++) {
			queue.addLast(i);
		}

		while(queue.size() > 1) {
			for(int i = 0; i < k-1; i++) {
				queue.addLast(queue.pollFirst());
			}
			queue.pollFirst();
		}

		return queue.pollFirst();
	}
}
