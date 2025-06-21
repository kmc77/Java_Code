package org.example.test_1;

import java.util.ArrayList;
import java.util.List;

public class EvenDigitsFilter {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String numStr = String.valueOf(arr[i]); // 현재 숫자를 문자열로 변환 (자릿수 분해를 위해)
            boolean allEven = true; // 모든 자릿수가 짝수인지 판단하는 플래그

            for (int j = 0; j < numStr.length(); j++) {
                int digit = numStr.charAt(j) - '0'; // 각 자릿수를 정수로 변환
                if (digit % 2 != 0) { // 홀수라면
                    allEven = false; // 조건 불충족
                    break; // 더 볼 필요 없음, 반복 종료
                }
            }

            if (allEven) {
                result.add(arr[i]); // 모든 자릿수가 짝수인 경우 결과 리스트에 추가
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1}; // 조건을 만족하는 숫자가 없을 경우 -1을 담아 반환
        }

        // 리스트를 배열로 변환하여 결과 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
