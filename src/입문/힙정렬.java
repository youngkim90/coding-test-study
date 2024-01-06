package 입문;

import java.util.Arrays;

public class 힙정렬 {
    public static void main(String[] args) {
        int[] array = {230, 10, 60, 550, 40, 220, 20};

        heapSort(array);

        System.out.println(Arrays.toString(array));
    }

    /**
     * 힙정렬(HeapSort)
     * 완전 이진 트리를 기본으로 하는 힙(Heap) 자료구조를 기반으로한 정렬 방식
     * 완전 이진 트리: 삽입할 때 왼쪽부터 차례대로 추가하는 이진 트리
     */
    public static void heapSort(int[] array) {
        int n = array.length;

        // max heap 초기화
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i); // 1
        }

        // extract 연산
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0); // 2
        }
    }

    public static void heapify(int array[], int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        //왼쪽 자식노드
        if (l < n && array[p] < array[l]) {
            p = l;
        }
        //오른쪽 자식노드
        if (r < n && array[p] < array[r]) {
            p = r;
        }

        //부모노드 < 자식노드
        if (i != p) {
            swap(array, p, i);
            heapify(array, n, p);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
