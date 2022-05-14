package 입문;

import java.io.IOException;

public class 선택정렬 {
    public static void main(String[] args) throws IOException {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int idxMin, tmp;

        for(int i=0; i<arr.length-1; i++) {
            idxMin = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[idxMin]) {
                    idxMin = j;
                }
            }
            tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
