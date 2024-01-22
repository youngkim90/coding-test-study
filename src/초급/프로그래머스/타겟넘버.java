package 초급.프로그래머스;

/**
 * 프로그래머스 level 2 - 타겟 넘버
 */
public class 타겟넘버 {
    static int count = 0;
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        int solution = solution(numbers, target);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return 0;
    }

    private static void dfs(int[] numbers, int depth, int target, int result){
        if (depth == numbers.length){
            if (target == result){
                count++;
            }
            return;
        }

        int add = result + numbers[depth];
        int sub = result - numbers[depth];

        dfs(numbers, depth+1, target, add);
        dfs(numbers, depth+1, target, sub);
    }
}
