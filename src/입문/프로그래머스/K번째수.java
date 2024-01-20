package 입문.프로그래머스;

import java.util.Arrays;

/**
 * 프로그래머스 level 1 - K번째 수
 */
public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4}; // 배열
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}}; // i,j,k

        int[] solution = solution(array, commands);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int a = commands[i][0], b= commands[i][1], c = commands[i][2];
            int[] range = Arrays.copyOfRange(array, a-1, b);
            Arrays.sort(range);
            answer[i] = range[c-1];
        }

        return answer;
    }
}
