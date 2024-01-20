package 초급.프로그래머스;

import java.util.Arrays;

/**
 * 프로그래머스 level 2 - 가장 큰 수
 */
public class 가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        String solution = solution(numbers);
        System.out.println("solution = " + solution);
    }

    public static String solution(int[] numbers) {
        String[] asStrs = Arrays.stream(numbers)
                .mapToObj(Integer::toString)
                .toArray(String[]::new);

        Arrays.sort(asStrs, (a, b) -> (b + a).compareTo(a + b));

        if (asStrs[0].equals("0")) {
            return "0";
        }

        return String.join("", asStrs);
    }
}
