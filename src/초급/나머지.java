package 초급;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 나머지 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];
        for(int i=0; i<10; i++){
            int result = Integer.parseInt(br.readLine())%42;
            arr[result]++;
        }

        int num = 0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] != 0){
                num++;
            }
        }
        bw.write(num +"\n");
        bw.flush();
        bw.close();
    }
}
