package 초급.프로그래머스;

/**
 * 프로그래머스 level 2 - 피로도
 */
public class 피로도 {
    private static int maxRun;
    private static boolean[] visited;

    public static void main(String[] args) {
        solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
        System.out.println("answer = " + maxRun);
    }

    private static void solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
    }

    private static void dfs(int idx, int k, int[][] dungeons) {
        for(int i=0; i<dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(idx + 1, k - dungeons[i][1], dungeons);
                visited[i] = false; // backtracking
            }
        }
        maxRun = Math.max(maxRun, idx);
    }
}
