package 초급;

import java.util.Scanner;

public class 별찍기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = "";
        for(int i=1; i<=N; i++){
            A+="*";
            System.out.println(A);
        }
    }
}

