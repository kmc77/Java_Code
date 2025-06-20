package org.example.test_1;

import java.util.*;

public class UniqueEvenIndexSum {
    public int solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]); // 중복 제거
        }

        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted); // 정렬

        int sum = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (i % 2 == 0) {
                sum += sorted.get(i); // 짝수 인덱스 누적 합
            }
        }

        return sum;
    }
}
