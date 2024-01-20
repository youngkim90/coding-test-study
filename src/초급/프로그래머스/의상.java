package 초급.프로그래머스;


import java.util.*;

/**
 * 프로그래머스 level 2 - 의상
 */
public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        int solution = solution(clothes);
        System.out.println("solution = " + solution);
    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            if (map.containsKey(type)) {
                int count = map.get(type);
                map.put(type, count+1);
            } else {
                map.put(type, 1);
            }
        }
        return map.values().stream().reduce(1, (x, y) -> x * (y + 1)) - 1;
    }

}
