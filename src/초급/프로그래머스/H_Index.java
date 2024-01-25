package 초급.프로그래머스;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 프로그래머스 level 2 - H-Index
 */
public class H_Index {
    public static void main(String[] args) {

        int solution = solution(new int[]{3, 0, 6, 1, 5});
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        int[] count = new int[length];
        for (int i = 0; i < length; i++) {
            if (citations[i] >= length - i) {
                count[i] = length - i;
            }
        }
        return IntStream.of(count).max().getAsInt();
    }
}
