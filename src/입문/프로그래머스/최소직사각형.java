package 입문.프로그래머스;

/**
 * 프로그래머스 level 1 - 최소직사각형
 */
public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int solution = solution(sizes);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[][] sizes) {
        int xmax = 0;
        int ymax = 0;
        for (int[] size : sizes) {
            xmax = Math.max(xmax, Math.max(size[0], size[1]));
            ymax = Math.max(ymax, Math.min(size[0], size[1]));
        }

        return xmax * ymax;
    }
}
