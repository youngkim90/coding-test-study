package 초급;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;

public class 최댓값 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<9; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        int max = 0;
        int index = 0;

        for(int j=0; j<arr.size(); j++) {
            if(arr.get(j) > max) {
                max = arr.get(j);
                index = j+1;
            }
        }
        bw.write(max + "\n");
        bw.write(index + "\n");
        bw.flush();
        bw.close();
    }
}
