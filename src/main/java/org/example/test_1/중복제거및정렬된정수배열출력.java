package org.example.test_1;

import java.util.Arrays;
import java.util.Scanner;

public class 중복제거및정렬된정수배열출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int[] uniNum = new int[n];
        int uniCount = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 중복 제거 로직
        for (int i = 0; i < numbers.length; i++) {
            boolean isUni = true;
            for (int j = 0; j < uniCount; j++) {
                if (numbers[i] == uniNum[j]) {
                    isUni = false;
                    break;
                }
            }
            if (isUni) {
                uniNum[uniCount++] = numbers[i]; // 중복이 아니면 추가
            }
        }

        // 중복 제거된 배열을 유효한 길이만큼 복사
        int[] result = Arrays.copyOf(uniNum, uniCount);

        // 결과 배열을 오름차순으로 정렬
        Arrays.sort(result); // Arrays.sort() 메서드를 사용하여 정렬합니다.

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
