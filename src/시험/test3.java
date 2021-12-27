package 시험;

public class test3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int[] answer = {};

        int order = 0;
        if(a == b){
            answer[0] = 0;
            answer[1] = 1;
        }
        else if(a>2 && b>2) {
            if ((a-b)%2 == 0) {
                answer[0] = 1;
                answer[1] = 4;
            } else{
                answer[0] = 0;
                answer[1] = 4;
            }
        } else {
            answer[0] = 0;
            answer[1] = 1;
        }
    }
}
