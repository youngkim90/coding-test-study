package 입문;

import java.util.Arrays;

public class 퀵정렬 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 98, 75, 87, 12, 4, 61, 100};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    /**
     * 퀵정렬(QuickSort)
     * 분할 정복(divide and conquer) 방법 을 통해 주어진 배열을 정렬
     * 분할 정복: 문제를 작은 2개의 문제로 분리하고 각각을 해결한 다음, 결과를 모아서 원래의 문제를 해결하는 전략
     * 시간복잡도 - O(nlog₂n)
     * 공간복잡도 - O(n)
     */
    public static void quickSort(int[] arr, int p, int r) {
        if (p >= r) return; // 원소가 1개인 경우 종료

        int q = partition(arr, p, r); // 분할

        quickSort(arr, p, q - 1);
        quickSort(arr, q + 1, r);
    }

    public static int partition(int[] arr, int p, int r) {
        int pivot = arr[p];
        int i = p, j = r;

        while (i < j) {
            while (pivot < arr[j]) {
                j--;
            }

            while (i < j && pivot >= arr[i]) {
                i++;
            }

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        arr[p] = arr[i];
        arr[i] = pivot;

        return i;
    }
}
