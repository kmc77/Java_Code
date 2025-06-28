package org.example.PCCE;

public class OddTripleSum {
    public int solution(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
