package org.example.test_4;

public class EvenAddOddSubtract {
    public int solution(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result += arr[i]; // 짝수면 더함
            } else {
                result -= arr[i]; // 홀수면 뺌
            }
        }

        return result;
    }
}
