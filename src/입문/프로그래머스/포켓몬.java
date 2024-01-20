package 입문.프로그래머스;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 프로그래머스 level 1 - 포켓몬
 */
public class 포켓몬 {

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4}; // 포켓몬 수
        solution(nums);
    }

    public static int solution(int[] nums) {
        HashSet<Integer> poketmons = new HashSet<>();

        Arrays.stream(nums).forEach(poketmons::add); // 중복 제거

        return Math.min(poketmons.size(), nums.length/2);
    }
}
