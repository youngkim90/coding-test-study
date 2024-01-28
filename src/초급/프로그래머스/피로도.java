package 초급.프로그래머스;

/**
 * 프로그래머스 level 2 - 피로도
 */
public class 피로도 {
    private static int maxRun = 0;
    public static void main(String[] args) {
        solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
        System.out.println("answer = " + maxRun);
    }

    private static void solution(int k, int[][] dungeons) {
        dfs(0, k, dungeons, 0);
    }

    private static void dfs(int idx, int fatigue, int[][] dungeons, int currentRun) {
        if (fatigue <= 0 || idx == dungeons.length) {
            maxRun = Math.max(maxRun, currentRun);
            return;
        }

        dfs(idx + 1, fatigue - dungeons[idx][1], dungeons, currentRun + 1);
        dfs(idx + 1, fatigue, dungeons, currentRun);
    }
}
