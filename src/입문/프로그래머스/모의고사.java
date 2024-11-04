package 입문.프로그래머스;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 프로그래머스 level 1 - 모의고사
 */
public class 모의고사 {
	public static void main(String[] args) {
		int[] answers = {1, 3, 2, 4, 2, 1};

		int[] solution = solution(answers);
		System.out.println("solution = " + Arrays.toString(solution));
	}

	private static int[] solution(int[] answers) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		int[] score = new int[3];
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % a.length])
				score[0]++;
			if (answers[i] == b[i % b.length])
				score[1]++;
			if (answers[i] == c[i % c.length])
				score[2]++;
		}
		int maxScore = IntStream.of(score).max().orElse(0);

		return IntStream.range(0, score.length)
						.filter(i -> score[i] == maxScore)
						.map(i -> i + 1)
						.toArray();
	}
}

