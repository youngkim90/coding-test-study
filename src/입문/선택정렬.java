package 입문;

import java.io.IOException;
import java.util.Arrays;

public class 선택정렬 {
    public static void main(String[] args) throws IOException {
        selectionSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    /**
     * 선택정렬(SelectionSort)
     * 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘
     * 시간복잡도 - O(n^2)
     * 공간복잡도 - O(n)
     */
    static void selectionSort(int[] arr) {
        int indexMin, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j; // 가장 작은 값의 인덱스를 저장
                }
            }
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
