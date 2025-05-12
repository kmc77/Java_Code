package org.example.test_5;

import java.util.Scanner;

public class 배열의모든연속된부분배열중합이큰값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        // 배열 원소 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 최대 부분 배열 합 계산
        int arrSum = maxSubArray(arr);

        // 결과 출력
        System.out.println("arrSum = " + arrSum);
    }

    public static int maxSubArray(int[] num) {
        // 첫 번째 원소로 초기화
        int max = num[0];  // 최대 합
        int currentSum = num[0];  // 현재 부분 배열 합

        // 두 번째 원소부터 시작
        for (int i = 1; i < num.length; i++) {
            // currentSum이 음수일 경우 현재 원소부터 시작
            currentSum = Math.max(num[i], currentSum + num[i]);
            // max는 currentSum과 비교하여 갱신
            max = Math.max(max, currentSum);
        }

        return max;
    }
}
