package org.example.test_4;

public class RemoveVowels {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 소문자 모음이 아니면 결과 문자열에 추가
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(c);
            }
        }

        return result.toString();
    }
}
