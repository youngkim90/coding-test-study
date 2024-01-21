package 입문.프로그래머스;

import java.util.*;

/**
 * 프로그래머스 level 1 - 같은 숫자는 싫어
 */
public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] solution = solution(arr);
        int[] solution2 = solution2(arr);
        System.out.println("solution = " + Arrays.toString(solution));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }

    private static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int num : arr) {
            if(stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        return stack.stream().mapToInt(i->i).toArray();
    }

    private static int[] solution2(int[] arr) {
        // 데이터가 커질 경우 LinkedList는 메모리 오버헤드가 발생할 수 있음
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);
        for(int num : arr) {
            if(list.getLast() != num) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
