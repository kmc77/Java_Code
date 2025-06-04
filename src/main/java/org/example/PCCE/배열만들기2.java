package org.example.PCCE;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기2 {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>(); // 결과를 저장할 리스트 생성

        // l부터 r까지 모든 정수에 대해 검사
        for (int i = l; i <= r; i++) {
            String s = i + ""; // 정수를 문자열로 변환하여 각 자리수를 확인하기 위해 준비
            boolean bool = true; // 모든 자리가 0 또는 5인지 확인하기 위한 플래그

            // 문자열의 각 자리수(char)를 확인
            for (char c : s.toCharArray()) {
                // 만약 해당 자리수가 0도 아니고 5도 아니면
                if (c != '0' && c != '5') {
                    bool = false; // 조건을 만족하지 않으므로 false로 설정
                    break; // 더 이상 볼 필요 없이 반복문 종료
                }
            }

            // 조건을 만족한 경우 결과 리스트에 추가
            if (bool) {
                answer.add(i);
            }
        }

        // 조건을 만족하는 수가 하나도 없으면 -1 추가
        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer; // 결과 리스트 반환
    }
}
