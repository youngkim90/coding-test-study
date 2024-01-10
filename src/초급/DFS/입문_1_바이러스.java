package 초급.DFS;

import java.util.*;
import java.io.*;

/**
 * 백준 2606번(실버3)
 */
public class 입문_1_바이러스 {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine()); // 노드
        M = Integer.parseInt(br.readLine()); // 간선

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        // 1. graph에 연결 정보 채우기
        int x, y;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        // 2. DFS(재귀함수) 호출
        dfs(1);

        // 3. 출력
        bw.write(String.valueOf(answer - 1));

        br.close();
        bw.close();
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        answer++;

        for (int i = 1; i < N; i++) {
            // i번째 노드를 방문하지 않았고, i번째 노드와 idx번째 노드가 연결되어 있는 경우 dfs 호출
            if (!visited[i] && graph[idx][i])
                dfs(i); // 재귀호출
        }
    }
}
