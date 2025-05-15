package org.example.test_5;

public class 연속된자연수의합으로주어진수표현 {
    public static int countConsecutiveSum(int N) {
        int count = 0;
        for (int start = 1, sum = 0; start <= N / 2 + 1; start++) {
            sum = start;
            for (int next = start + 1; sum < N; next++) {
                sum += next;
            }
            if (sum == N) count++;
        }
        return count + 1; // N 자체도 포함
    }

    public static void main(String[] args) {
        System.out.println(countConsecutiveSum(15)); // 4
    }
}
