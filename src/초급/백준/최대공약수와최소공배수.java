package 초급.백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result1 = 0;
        int result2 = 0;
        if(a>b) {
            int num = a%b;
            if(num == 0) {
                result1 = b;
            } else {
                result1 = redevide(b, a%b);
            }
        } else {
            int num = b%a;
            if(num == 0) {
                result1 = a;
            } else {
                result1 = redevide(a, b%a);
            }
        }

        result2 = a*b/result1;

        bw.write(result1 +"\n");
        bw.write(result2 +"\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int redevide (int a, int b) {
        if(a%b == 0) return b;
        return redevide(b,a%b);
    }
}