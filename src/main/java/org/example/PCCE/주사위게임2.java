package org.example.PCCE;

public class 주사위게임2 {
    public int solution(int a, int b, int c) {
        // 세 숫자의 합을 먼저 계산해서 answer에 저장
        int answer = a + b + c;

        // 두 숫자가 같으면 (a + b + c) * (a^2 + b^2 + c^2) 계산
        if (a == b || b == c || a == c) {
            answer *= (a * a + b * b + c * c);
        }

        // 세 숫자가 모두 같으면 위 결과에 (a^3 + b^3 + c^3)까지 곱함
        if (a == b && b == c) {
            answer *= (a * a * a + b * b * b + c * c * c);
        }
        return answer;
    }
}
