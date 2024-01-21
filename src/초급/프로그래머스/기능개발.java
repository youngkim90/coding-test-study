package 초급.프로그래머스;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 프로그래머스 level 2 - 기능개발
 */
public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] solution = solution(progresses, speeds);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        int prev = 0;
        for(int i=0; i<progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int day = (int) Math.ceil((100 - progress) / (double) speed);
            if(map.isEmpty() || prev < day) {
                map.put(day, 1);
                prev = day;
                continue;
            }
            map.put(prev, map.get(prev)+1);
        }
        return map.values().stream().mapToInt(i->i).toArray();
    }
}
