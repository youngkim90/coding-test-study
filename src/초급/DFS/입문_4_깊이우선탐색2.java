package 초급.DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 백준 24480번
 */
public class 입문_4_깊이우선탐색2 {
    final static int MAX = 1000000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M, R;
    static int[] answer;
    static int order;

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드
        M = Integer.parseInt(st.nextToken()); // 간선
        R = Integer.parseInt(st.nextToken()); // 시작점

        // 1. graph에 연결 정보 채우기
        graph = new ArrayList[MAX];
        for (int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();
        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        // 2. 내림차순 정렬
        for(int i = 1; i <= N; i++)
            graph[i].sort(Collections.reverseOrder());

        // 3. DFS(재귀함수) 호출
        dfs(R);

        // 4. 출력
        for(int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        bw.close();
        br.close();
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order;
        order++;

        for(int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if(!visited[next])
                dfs(next);
        }
    }
}
