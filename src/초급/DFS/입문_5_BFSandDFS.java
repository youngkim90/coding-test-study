package 초급.DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 백준 1260번
 */
public class 입문_5_BFSandDFS {
    final static int MAX = 1000 + 10;
    static ArrayList<Integer> queue;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드
        M = Integer.parseInt(st.nextToken()); // 간선
        V = Integer.parseInt(st.nextToken()); // 시작점

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
        dfs(V);
        System.out.println();

        // 3. BFS 호출
        bfs();

        // 4. 출력

        bw.close();
        br.close();
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        System.out.println(idx + " ");

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i])
                dfs(i);
        }
    }

    private static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[MAX];

        queue.add(V);
        visited[V] = true;

        while(!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.println(idx + " ");

            for (int i = 1; i <= N; i++) {
                if (!visited[i] && graph[idx][i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
