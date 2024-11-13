package 초급.프로그래머스;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class 표편집 {
	public static void main(String[] args) {
		String solution = solution(8, 2,
			new String[] {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"});
		System.out.println("solution = " + solution);
	}

	private static String solution(int n, int k, String[] cmd) {
		TreeSet<Integer> rows = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			rows.add(i);
		}

		ArrayDeque<Integer> removedStack = new ArrayDeque<>();

		for (String c : cmd) {
			if (c.startsWith("U")) {
				int move = Integer.parseInt(c.substring(2));
				for (int i = 0; i < move; i++) {
					k = rows.lower(k);
				}
			} else if (c.startsWith("D")) {
				int move = Integer.parseInt(c.substring(2));
				for (int i = 0; i < move; i++) {
					k = rows.higher(k);
				}
			} else if (c.equals("C")) {
				removedStack.push(k);
				rows.remove(k);

				if (rows.higher(k) != null) {
					k = rows.higher(k);
				} else {
					k = rows.lower(k);
				}
			} else if (c.equals("Z")) {
				int restored = removedStack.pop();
				rows.add(restored);
			}
		}

		StringBuilder sb = new StringBuilder("O".repeat(n));
		while (!removedStack.isEmpty()) {
			sb.setCharAt(removedStack.pop(), 'X');
		}

		return sb.toString();
	}
}
