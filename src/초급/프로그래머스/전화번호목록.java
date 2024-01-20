package 초급.프로그래머스;


import java.util.Arrays;

/**
 * 프로그래머스 level 2 - 전화번호 목록
 */
public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88","12"};
        solution(phone_book);
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            boolean check = phone_book[i + 1].startsWith(phone_book[i]);
            if(check) return false;
        }
        return true;
    }

}
