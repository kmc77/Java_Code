package org.example.test_5;

import java.util.Scanner;

public class DP를이용한가장큰정사각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열 크기 입력 받기
        System.out.print("행의 개수: ");
        int m = sc.nextInt();  // 행 크기
        System.out.print("열의 개수: ");
        int n = sc.nextInt();  // 열 크기

        int[][] matrix = new int[m][n];

        // 행렬 입력 받기
        System.out.println("행렬의 값을 입력해주세요 (0 또는 1): ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 가장 큰 정사각형 한 변의 길이 계산
        int result = maximalSquare(matrix);
        System.out.println("가장 큰 정사각형의 한 변의 길이: " + result);
    }

    public static int maximalSquare(int[][] matrix) {
        if (matrix.length == 0) return 0;  // 만약 matrix가 비어 있으면 0 리턴
        int m = matrix.length, n = matrix[0].length;  // 행과 열의 크기
        int maxSize = 0;  // 가장 큰 정사각형 한 변의 길이
        int[][] dp = new int[m][n];  // DP 배열 생성

        // 2차원 배열을 순차적으로 돌면서 처리
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {  // 현재 칸이 1인 경우
                    if (i == 0 || j == 0) {  // 첫 번째 행 또는 첫 번째 열
                        dp[i][j] = 1;  // 첫 번째 행과 열은 자기 자신이 가장 큰 정사각형
                    } else {
                        // 상, 좌, 좌상단 중 최소값 + 1
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    // 최대 크기 갱신
                    maxSize = Math.max(maxSize, dp[i][j]);
                }
            }
        }
        return maxSize;  // 가장 큰 정사각형 한 변의 길이 반환
    }
}
