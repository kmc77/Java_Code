package org.example.PCCE;

public class 카운트업 {
    public int[] solution(int start_num, int end_num) {
        // 시작 숫자부터 끝 숫자까지의 개수만큼 배열을 만듦
        int[] answer = new int[end_num - start_num + 1];

        for (int i = 0; i < answer.length; i++) {
            // i는 배열의 인덱스, 실제 넣을 값은 start_num + i
            answer[i] += start_num + i;
        }
        return answer;
    }
}
