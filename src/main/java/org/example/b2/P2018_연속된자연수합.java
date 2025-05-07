package org.example.b2;

import java.util.Scanner;

public class P2018_연속된자연수합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cut = 1;           // 정답: 경우의 수 (N 자기 자신 포함)
        int s_index = 1;       // 시작 포인터 (왼쪽)
        int e_index = 1;       // 끝 포인터 (오른쪽)
        int sum = 1;           // 현재 구간의 합

        while (e_index != N) {
            if (sum == N) {
                cut++;         // 합이 N이면 경우의 수 추가
                e_index++;     // 끝 포인터 확장
                sum += e_index;
            } else if (sum > N) {
                sum -= s_index; // 합이 크면 시작 포인터 축소
                s_index++;
            } else {
                e_index++;     // 합이 작으면 끝 포인터 확장
                sum += e_index;
            }
        }
        System.out.println(cut);
    }
}
