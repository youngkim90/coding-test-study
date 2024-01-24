package 초급.프로그래머스;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 프로그래머스 level 2 - 올바른 괄호
 */
public class 올바른괄호 {
    public static void main(String[] args) {

        boolean solution = solution("(())()");
        System.out.println("solution = " + solution);
    }

    public static boolean solution(String s) {
        if(!s.startsWith("(") || !s.endsWith(")") || s.length() < 2) {
            return false;
        }

        int countA = 0;
        int countB = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                countA++;
            } else {
                countB++;
                if(countB > countA) return false;
            }
        }

        return countA == countB;
    }
}
