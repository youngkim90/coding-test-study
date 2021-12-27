package 시험;

import java.util.ArrayList;
import java.util.List;

public class test2 {

    public static void main(String[] args) {
        long n = 6;
        long[] answer = new long[2];

        if(n > 2){
            boolean boPrime = true;
            List<Integer> primeList = new ArrayList<>();
            for(int i=2; i<n; i++){
                for(int j=2; j<i; j++) {
                    if(i%j == 0) boPrime = false;
                }
                if(boPrime) primeList.add(i);
            }

            boolean boResult = false;
            for (int i=0; i<primeList.size(); i++) {
                long a = primeList.get(i);
                for(int j=i+1; j<primeList.size(); j++) {
                    long b = primeList.get(j);
                    if(a * b == n) {
                        answer[0] = b;
                        answer[1] = a;
                        boResult = true;
                    }
                }
            }

            if(!boResult) {
                answer[0] = -1l;
                answer[1] = -1l;
            }
        }

        System.out.println("answer = " + answer);

    }
}
