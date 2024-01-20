package 입문.백준;

import java.util.Scanner;

public class 약수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<=10000 && b<=a) {
            int index = 1;
            Integer result = null;

            for(int i=1; i<=a; i++) {
                if(a%i==0) {
                    if(index == b) {
                        result = i;
                        break;
                    } else {
                        index++;
                    }
                }
            }

            if(result == null) System.out.println(0);
            else System.out.println(result);
        }




    }
}
