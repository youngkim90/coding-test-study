package 초급.프로그래머스;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 프로그래머스 level 2 - 프로세스
 */
public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int localtion = 0;

        int solution = solution(priorities, localtion);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] priorities, int localtion) {
        Queue<int[]> queue = IntStream
                .range(0, priorities.length)
                .mapToObj(i -> new int[]{i, priorities[i]})
                .collect(Collectors.toCollection(LinkedList::new));

        int count = 0;
        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            if(hasHigherPriority(queue, poll[1])) {
                queue.offer(poll);
            } else {
                count++;
                if(poll[0] == localtion) {
                    return count;
                }
            }
        }
        return count;
    }

    private static boolean hasHigherPriority(Queue<int[]> queue, int number) {
        return queue.stream().anyMatch(i -> i[1] > number);
    }
}
