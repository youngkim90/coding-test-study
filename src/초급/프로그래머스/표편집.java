package 초급.프로그래머스;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class 표편집 {
	public static void main(String[] args) {
		String solution = solution(8, 2, new String[] {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"});
		System.out.println("solution = " + solution);
	}

	private static String solution(int n, int k, String[] cmd) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}

		ArrayDeque<int[]> stack = new ArrayDeque<>();

		for (String c : cmd) {
			if (c.startsWith("C")) {
				Integer removed = list.remove(k);
				stack.push(new int[]{k, removed});
			} else if (c.startsWith("Z")) {
				if (!stack.isEmpty()) {
					int[] restore = stack.pop();
					list.add(restore[0], restore[1]);
				}
			} else {
				int moved = Integer.parseInt(c.substring(2));
				if (c.startsWith("U")) {
					k -= moved;
				} else {
					k += moved;
				}
			}

			// 위치 조정
			if (k >= list.size()) {
				k = list.size() - 1;
			}
			if (k < 0) {
				k = 0;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(list.contains(i) ? "O" : "X");
		}
		return sb.toString();
	}
}
