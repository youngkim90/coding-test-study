package 초급.프로그래머스;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스 level 2 - 소수찾기
 */
public class 소수찾기 {
    static String number;
    static List<Integer> checkedNum = new ArrayList<>();
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) {
        int solution = solution("17");
        System.out.println("solution = " + solution);
    }

    public static int solution(String numbers) {
        number = numbers;
        visited = new boolean[numbers.length()];
        dfs(0);
        return answer;
    }

    private static void dfs(int num) {
        if (checkedNum.contains(num)) return;
        checkedNum.add(num);

        if (isPrime(num)) {
            answer++;
        }

        for (int i = 0; i < number.length(); i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(num * 10 + (number.charAt(i) - '0'));
            visited[i] = false; // backtracking
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
