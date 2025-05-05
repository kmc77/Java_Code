package org.example.test_4;

import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] numbers = new long[n + 1];
        numbers[0] = 0; // 피보나치 수열의 첫 번째 값
        numbers[1] = 1;

        for (int i = 2; i <= n; i++) { // 2번째 인덱스부터 n번째까지 계산
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        System.out.println("numbers = " + numbers[n]);
    }
}
