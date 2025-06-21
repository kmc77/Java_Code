package org.example.test_1;

public class AccumulateUntil100 {
    public int solution(int[] arr) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
            if (sum >= 100) break;
        }

        return count;
    }
}
