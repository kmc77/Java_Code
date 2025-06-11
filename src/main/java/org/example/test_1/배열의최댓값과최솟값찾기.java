package org.example.test_1;

import java.util.Scanner;

public class 배열의최댓값과최솟값찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열의 첫 번째 값을 기준으로 최솟값과 최댓값 초기화
        int min = arr[0], max = arr[0];

        // 배열을 하나씩 검사하면서 최솟값과 최댓값을 찾음
        for (int num : arr) {
            if (num < min) min = num;  // 더 작은 값이 나오면 최솟값 업데이트
            if (num > max) max = num;  // 더 큰 값이 나오면 최댓값 업데이트
        }

        // 결과 출력
        System.out.println("최솟값: " + min);
        System.out.println("최댓값: " + max);
    }
}
