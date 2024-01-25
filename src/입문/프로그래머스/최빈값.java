package 입문.프로그래머스;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 level 1 - 최빈값 구하기
 */
public class 최빈값 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};

        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }

        System.out.println("answer = " + answer);
    }
}
