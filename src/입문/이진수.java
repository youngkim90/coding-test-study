package 입문;

import java.util.Scanner;

public class 이진수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String[] binaryArray = new String[a];

        for(int i=0; i<a; i++) {
            int b = sc.nextInt();

            String binary = "";
            while(b!=1) {
                binary += b%2;
                b = b / 2;
            }
            binary += b;
            binaryArray[i] = binary;
        }
        for (String c : binaryArray) {
            String result = "";
            for(int i=0; i<c.length(); i++) {
                if(c.charAt(i) == '1') {
                    result += i + " ";
                }
            }
            System.out.println(result);
        }
    }
}
