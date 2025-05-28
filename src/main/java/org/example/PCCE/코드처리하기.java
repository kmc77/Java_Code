package org.example.PCCE;

public class 코드처리하기 {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0; // 초기 모드는 0

        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);

            // '1'이 나오면 mode를 전환하고 continue
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue; // '1'은 결과에 추가되지 않음
            }

            // mode에 따라 짝수/홀수 인덱스를 추가
            if (i % 2 == mode) {
                answer.append(current);
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
