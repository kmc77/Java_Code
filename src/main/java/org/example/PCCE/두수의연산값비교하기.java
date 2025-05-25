package org.example.PCCE;

public class 두수의연산값비교하기 {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(String.valueOf(a + "" + b));

        if (2 * a * b <= answer) {
            return answer;
        } else {
            return 2 * a * b;
        }
    }
}