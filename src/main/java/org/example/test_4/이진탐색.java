package org.example.test_4;

import java.util.Arrays;
import java.util.Scanner;

public class 이진탐색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 크기 입력받기
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 배열 요소 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열 정렬 (이진 탐색 전 필수)
        Arrays.sort(arr);

        // 찾고자 하는 값 입력받기
        int target = sc.nextInt();

        // 이진 탐색의 왼쪽, 오른쪽 경계와 결과값 초기화
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) { // 중간값이 찾는 값이라면
                index = mid; // 인덱스 저장
                break; // 탐색 종료
            } else if (arr[mid] < target) { // 중간값이 작으면 오른쪽으로 이동
                left = mid + 1;
            } else { // 중간값이 크면 왼쪽으로 이동
                right = mid - 1;
            }
        }

        // 결과 출력
        System.out.println(index);
    }
}
