package org.example.test_1;

import java.util.Scanner;

public class 배열요소곱하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        // 첫 번째 배열의 원소 n개 입력 받기
        for (int i = 0; i < n; i++) {
            arrayA[i] = sc.nextInt();
        }

        // 두 번째 배열의 원소 n개 입력 받기
        for (int i = 0; i < n; i++) {
            arrayB[i] = sc.nextInt();
        }

        // 각 배열의 같은 인덱스 값끼리 곱하여 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arrayA[i] * arrayB[i] + " ");
        }
    }
}