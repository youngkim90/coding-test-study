package 초급;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 피보나치수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a = 0;
        if(n == 0){
            bw.write(0 + "\n");
        } else {
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;

            for(int i=1; i<n; i++){
                arr[i+1] = arr[i] + a;
                a = arr[i];
            }
            bw.write(arr[n] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}