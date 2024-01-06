package 입문;

import java.util.Arrays;

public class 병합정렬 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 98, 75, 87, 12, 4, 61, 100};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 병합정렬(MergeSort)
     * 분할 정복(divide and conquer) 방법 을 통해 주어진 배열을 정렬
     * 영역을 쪼갤 수 있을 만큼 쪼갠 후에 정렬
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] L = Arrays.copyOfRange(arr, left, mid + 1);
        int[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        int ll = L.length, rl = R.length;

        while (i < ll && j < rl) {
            if (L[i] <= R[j]) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }

        while (i < ll) {
            arr[k++] = L[i++];
        }
        while (j < rl) {
            arr[k++] = R[j++];
        }
    }
}
