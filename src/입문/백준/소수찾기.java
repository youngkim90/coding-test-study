package 입문.백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class 소수찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int result = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            boolean boCheck = true;
            if(num > 2){
                for(int i=2; i<num; i++){
                    if(num % i == 0){
                        boCheck = false;
                    }
                }
            } else if( num == 2){
            } else {
                boCheck = false;
            }

            if(boCheck){
                result++;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}