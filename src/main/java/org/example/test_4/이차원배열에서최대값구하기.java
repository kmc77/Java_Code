package org.example.test_4;

import java.util.Scanner;

public class 이차원배열에서최대값구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr2d = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        int max = arr2d[0][0];

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > max) {
                    max = arr2d[i][j];
                }
            }
        }
        System.out.println("max = " + max);
    }
}
