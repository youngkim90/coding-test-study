package 입문;

import java.util.Arrays;

public class 거품정렬 {

    public static void main(String[] args) {
        bubbleSort(new int[]{8, 10, 1, 5, 3, 7, 2, 4, 6, 9});
    }

    /**
     * 거품정렬(BubbleSort)
     * 서로 인접한 두 원소의 대소를 비교하고, 조건에 맞지 않다면 자리를 교환하며 정렬하는 알고리즘
     * 시간복잡도 - O(n^2)
     * 공간복잡도 - O(n)
     */
    static void bubbleSort(int[] arr) {
        int temp = 0; // swap을 위한 임시 변수
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
