package org.example.PCCE;

public class 가장큰이어붙이기 {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + b);
        int ba = Integer.parseInt(String.valueOf(b) + a);

        return ab > ba ? ab : ba;
    }
}
