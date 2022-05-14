package 입문;

import java.io.IOException;

public class 삽입정렬 {
    public static void main(String[] args) throws IOException {
        int[] arr = {8,10,1,5,3,7,2,4,6,9};

        for(int i=1; i<arr.length; i++) {
            int tmp = arr[i];
            int aux = i - 1;

            while (aux>=0 && arr[aux] > tmp) {
                arr[aux+1] = arr[aux];
                aux--;
            }

            arr[aux+1] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
