package 입문.정렬;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class 이분탐색 {
    public static void main(String[] args) {
        int i = binarySearch(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 7);
        System.out.println("i = " + i);
    }

    /**
     * 이분탐색(BinarySearch)
     * 정렬된 배열에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 알고리즘
     */
    public static int binarySearch(int[] arr, int M) {
        Arrays.sort(arr); // 정렬

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (M == arr[mid]) {
                return mid;
            } else if (arr[mid] < M) {
                start = mid + 1;
            } else if (M < arr[mid]) {
                end = mid - 1;
            }
        }
        throw new NoSuchElementException("타겟 존재하지 않음");
    }
}
