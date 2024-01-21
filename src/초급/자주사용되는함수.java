package 초급;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 자주사용되는함수 {
    /* 배열 */
    void Arrays() {
        int[] arr1 = {10, 8, 11, 2, 3, 0};

        // 1. 오름차순 {0, 2, 3, 8, 10, 11}
        Arrays.sort(arr1);

        // 2. 내림차순 {11, 10, 8, 3, 2, 0}
        Arrays.sort(IntStream.of(arr1).boxed().toArray(), Collections.reverseOrder());

        // 3. 일부만 정렬 {2, 8, 11, 10, 3, 0} (0~4만 정렬)
        Arrays.sort(IntStream.of(arr1).boxed().toArray(), 0, 4);

        // 4. 오름차순 정렬하면 binary search로 특정 값을 찾을 수 있다.
        Arrays.binarySearch(arr1, 2);

        // 5. 배열을 어레이리스트로 변환할 떼!
        List list = Arrays.stream(arr1).boxed().collect(Collectors.toList());

        // 6. 배열의 특정 범위 자르기
        int[] tmp = Arrays.copyOfRange(arr1, 0, 3);

        // 7. 배열의 원소 중 특정 조건에 만족하는 원소가 있는지 확인
        boolean bo = Arrays.stream(arr1).boxed().anyMatch(val -> val > 3);

        // 8. 배열의 모든 원소를 계산 후에 하나의 결과로 뽑아낼 때 사용 reduce(초기값, 람다식(누적값, 현재값))
        int result = Arrays.stream(arr1).boxed().reduce(1, (x, y) -> x * (y + 1));

        // 9. 리스트 컬렉션을 int형 배열로 변환
        int[] array = new ArrayList<Integer>().stream().mapToInt(i -> i).toArray();
    }

    void String() {
        String str1 = "Hello World";

        // 1. 자르기
        str1.split(" ");
        str1.substring(0, 5);
        for (int i = 0; i < str1.length(); i++) {
            str1.charAt(i);
        }

        // 1-1. 문자열을 배열로 만들고 싶을 때
        String str2 = "12345";
        String[] Arr = str2.split("");

        // 대소문자 변경
        str2 = str2.toUpperCase();        // HELLO WORLD
        str2 = str2.toLowerCase();        // hello world

        // 한번 쓴 문자열은 변경 불가. substring 이용해서 새로운 변수로 선언해야함
        String name = "coding";
        String newname = name.substring(0, 4) + 'b' + name.substring(5);    // starbucks
    }

    void ArrayList() {
        // 1. 선언
        ArrayList<String> list = new ArrayList<>();

        // 2. 삽입
        list.add("java");            // {"java"}
        list.add(0, "ryu");            // {"ryu", "java"} (0번째 인덱스에 삽입)

        // 3. 수정
        list.set(1, "c++");            // {"ryu", "c++"}

        // 4. 삭제
        list.remove(1);                // {"ryu"}

        // 5. 값 존재 유무 확인
        list.contains("java");        // false
        list.indexOf("ryu");        // 0 존재하면 인덱스 리턴

        // 6. iterator 사용
        ListIterator<String> it = list.listIterator();

        // 6-1. 인덱스 오름차순 순회
        while (it.hasNext()) {
            // ...
        }

        // 6-2. 인덱스 내림차순 순회
        while (it.hasPrevious()) {
            // ...
        }

        // 7. 중복없이 값을 넣고 싶을 때
        if (list.indexOf("a") < 0) {    // 없으면 -1을 리턴하기 때문에
            list.add("a");
        }

        // 8. 리스트 값 하나씩 가져올 때 (int 일 경우)
        for (int i = 0; i < list.size(); i++) {
            Integer.parseInt(list.get(i));
        }
    }

    void Queue() {
        // 1. 선언
        Queue<Integer> q = new LinkedList<>();        // linked list로 선언해야함

        // 2. 삽입
        q.add(10);            // {10}
        q.offer(2);            // {10, 2}

        // 3. 프론트값 반환
        q.peek();            // 10

        // 4. 삭제
        q.remove();
        q.poll();

        // 5. 초기화
        q.clear();

        // 6. 비었는지
        q.isEmpty();

        // 7. pair 같은 경우는 그냥 구현해서 사용
        /*static class Node{
            int y;
            int x;
            int dist;

            Node(int y,int x,int dist){
                this.y=y;
                this.x=x;
                this.dist=dist;
            }
        }

        Queue<Node> queue=new LinkedList<>();
        queue.add(new Node(1,2,3));
        Node node= queue.poll();*/
    }

    void Math() {
        // 1. 최대 최소
        Math.max(10, 2);
        Math.min(10, 2);

        // 2. 절대값
        Math.abs(-3);

        // 3. 올림 내림 반올림
        Math.ceil(-3.2);		// -3
        Math.floor(-3.2);		// -4
        Math.round(-3.26);		// -3	첫째자리에서 반올림

        // 3-1. 소수 둘째, 셋째 자리에서 반올림 하고 싶다면
        double a = 1.23456;
        String b = String.format("%.1f", a);	// .1f는 둘째자리에서 반올림

        // 4. 제곱, 제곱근
        Math.pow(2, 2);		// 2^2 = 4
        Math.sqrt(4);		// 2
    }
}
