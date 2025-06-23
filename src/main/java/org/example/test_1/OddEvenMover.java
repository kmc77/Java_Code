package org.example.test_1;

public class OddEvenMover {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int targetIdx;

            if (arr[i] % 2 == 0) {
                targetIdx = i + 1; // 짝수 → 오른쪽으로 이동
            } else {
                targetIdx = i - 1; // 홀수 → 왼쪽으로 이동
            }

            if (targetIdx >= 0 && targetIdx < arr.length) {
                result[targetIdx] += arr[i]; // 이미 값이 있으면 합산
            }
        }

        return result;
    }
}
