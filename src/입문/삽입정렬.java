package 입문;

import java.io.IOException;
import java.util.Arrays;

public class 삽입정렬 {
    public static void main(String[] args) throws IOException {
        insertionSort(new int[]{8, 10, 1, 5, 3, 7, 2, 4, 6, 9});
    }

    /**
     * 삽입정렬(InsertionSort)
     * 2번째 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후, 원소를 뒤로 옮기고 지정된 자리에 자료를 삽입
     * 시간복잡도 - O(n^2)
     * 공간복잡도 - O(n)
     */
    static void insertionSort(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int temp = arr[index];
            int prev = index - 1;
            while ((prev >= 0) && (arr[prev] > temp)) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
