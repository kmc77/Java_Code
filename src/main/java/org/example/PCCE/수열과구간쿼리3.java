package org.example.PCCE;

public class 수열과구간쿼리3 {
    public int[] solution(int[] arr, int[][] queries) {

        // 각 쿼리에 대해 반복 (쿼리마다 두 인덱스의 값을 교환)
        for (int i = 0; i < queries.length; i++) {
            int index1 = queries[i][0];
            int index2 = queries[i][1];

            // 두 인덱스의 값을 서로 교환
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
        return arr;
    }
}
