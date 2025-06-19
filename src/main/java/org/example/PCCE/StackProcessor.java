package org.example.PCCE;

import java.util.ArrayList;

public class StackProcessor {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;

        // i가 arr 길이 미만일 때까지 반복
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                // stk 마지막 원소를 가져옴
                int last = stk.get(stk.size() - 1);

                if (last < arr[i]) {
                    // 마지막 원소가 현재 원소보다 작으면 현재 원소 추가 후 다음 인덱스로 이동
                    stk.add(arr[i]);
                    i++;
                } else {
                    // 마지막 원소가 현재 원소보다 크거나 같으면 마지막 원소 제거, 인덱스는 유지
                    stk.remove(stk.size() - 1);
                }
            }
        }

        // ArrayList를 int 배열로 변환하여 반환
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
