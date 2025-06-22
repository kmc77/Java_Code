package org.example.test_1;

public class CodeDecoder {
    public String solution(String code) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            // 짝수 인덱스 처리
            if (i % 2 == 0) {
                if (c == '1') result.append("A");
                else if (c == '2') result.append("B");
                else if (c == '3') result.append("C");
            }

            // 홀수 인덱스 처리
            else {
                if (c == '4') result.append("X");
                else if (c == '5') result.append("Y");
                else if (c == '6') result.append("Z");
            }
        }

        return result.toString();
    }
}
