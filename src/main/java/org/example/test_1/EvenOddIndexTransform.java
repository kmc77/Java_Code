package org.example.test_1;

public class EvenOddIndexTransform {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[i] * 2;
            } else {
                result[i] = arr[i] + 3;
            }
        }

        return result;
    }
}