package 초급.백준;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS와DFS {
    static int map[][];
    static boolean visited[];
    static int x, y;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        int start = scan.nextInt();
        map = new int[x+1][x+1];

        for(int i=0; i<y; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            map[a][b] = map[b][a] = 1;
        }

        visited = new boolean[x+1];
        DFS(start);
        System.out.println();
        visited = new boolean[x+1];
        BFS(start);

        scan.close();
    }

    /**
     * 개념
     * 루트 노드 또는 임의 노드에서 인접한 노드부터 먼저 탐색하는 방법
     * 최소 비용(즉, 모든 곳을 탐색하는 것보다 최소 비용이 우선일 때)에 적합
     * 큐를 통해 구현
     * 시간복잡도 - O(V+E) (V: 정점의 수, E: 간선의 수)
     */
    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int tmp = queue.poll();
            System.out.print(tmp + " ");

            for(int i=0; i<x+1; i++) {
                if(map[tmp][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    /**
     * DFS
     * 루트 노드 혹은 임의 노드에서 다음 브랜치로 넘어가기 전에, 해당 브랜치를 모두 탐색하는 방법
     * 모든 경로를 방문해야 할 경우 사용에 적합
     * 스택 or 재귀함수를 통해 구현
     * 시간복잡도 - O(V+E) (V: 정점의 수, E: 간선의 수)
     */
    public static void DFS(int start) {
        visited[start] = true;
        System.out.print(start + " ");

        for(int i=0; i<x+1; i++) {
            if(map[start][i] == 1 && !visited[i]) {
                DFS(i);
            }
        }
    }
}