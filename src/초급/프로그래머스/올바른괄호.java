package 초급.프로그래머스;

/**
 * 프로그래머스 level 2 - 올바른 괄호
 */
public class 올바른괄호 {
    public static void main(String[] args) {

        boolean solution = solution("(())()");
        System.out.println("solution = " + solution);
    }

    public static boolean solution(String s) {
        if (!s.startsWith("(") || !s.endsWith(")")) {
            return false;
        }

        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}
