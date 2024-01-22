package 초급.프로그래머스;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * 프로그래머스 level 2 - 더 맵게
 */
public class 더맵게 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};

        int solution = solution(scoville, 7);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));

        int answer = 0;
        while (!queue.isEmpty()) {
            int minScovill = queue.poll();
            if (minScovill >= K) {
                break;
            }
            if (queue.isEmpty()) {
                return -1;
            }
            int secondScovill = queue.poll();
            int newScoville = minScovill + (secondScovill * 2);
            queue.offer(newScoville);
            answer++;
        }

        return answer;
    }
}
