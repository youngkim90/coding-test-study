package 초급.DFS;

import java.util.*;
import java.io.*;

/**
 * 백준 11724번(실버2)
 */
public class 입문_2_연결요소의개수 {
    final static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드
        M = Integer.parseInt(st.nextToken()); // 간선

        // 1. graph에 연결 정보 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        // 2. DFS(재귀함수) 호출
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++; // 연결된 노드의 요소 개수 증가
            }
        }

        // 3. 출력
        bw.write(String.valueOf(answer));

        bw.close();
        br.close();
    }

    private static void dfs(int idx) {
        visited[idx] = true;

        for (int i = 1; i <= N; i++) {
            // i번째 노드를 방문하지 않았고, i번째 노드와 idx번째 노드가 연결되어 있는 경우 dfs 호출
            if (!visited[i] && graph[idx][i])
                dfs(i); // 재귀호출
        }
    }
}
