package org.example.PCCE;

import java.util.ArrayList;

public class ConditionalStackBuilder {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++; // 다음 인덱스로 이동
            } else {
                int last = stk.get(stk.size() - 1);
                if (last < arr[i]) {
                    stk.add(arr[i]);
                    i++; // 다음 인덱스로 이동
                } else {
                    stk.remove(stk.size() - 1); // 마지막 요소 제거, i는 그대로
                }
            }
        }

        // ArrayList → int[] 변환
        int[] result = new int[stk.size()];
        for (int k = 0; k < stk.size(); k++) {
            result[k] = stk.get(k);
        }

        return result;
    }
}
