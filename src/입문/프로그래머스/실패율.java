package 입문.프로그래머스;

import java.util.Arrays;
import java.util.HashMap;

public class 실패율 {
	public static void main(String[] args) {
		int[] answer = solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
		System.out.println("answer = " + Arrays.toString(answer));
	}

	private static int[] solution(int N, int[] stages) {
		int[] challenger = new int[N + 2];
		for (int stage : stages) {
			challenger[stage]++;
		}

		HashMap<Integer, Double> fails = new HashMap<>();
		double total = stages.length;

		for (int i = 1; i < N + 1; i++) {
			fails.put(i, challenger[i] == 0 ? 0. : challenger[i] / total);
			total -= challenger[i];
		}

		return fails.entrySet()
					.stream()
					.sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
					.mapToInt(HashMap.Entry::getKey)
					.toArray();
	}
}
