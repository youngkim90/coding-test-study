package 입문.프로그래머스;

import java.util.Arrays;

/**
 * 프로그래머스 level 1 - 체육복
 */
public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(n, lost, reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n - lost.length;
        for (int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int number : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (number - 1 == reserve[j] || number + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
