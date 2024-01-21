package 초급.프로그래머스;

import java.util.Arrays;

/**
 * 프로그래머스 level 2 - 카펫
 */
public class 카펫 {
    public static void main(String[] args) {
        int[] solution = solution(10, 2);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i=3; i<=sum; i++) {
            if(sum % i == 0) {
                int x = sum / i;
                int y = sum / x;

                if(x >= y && x >= 3 && y >= 3) {
                    if(yellow == (x-2) * (y-2)) {
                        answer[0] = x;
                        answer[1] = y;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
