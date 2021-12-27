package 초급;

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