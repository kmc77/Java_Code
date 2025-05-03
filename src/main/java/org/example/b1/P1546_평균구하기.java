package org.example.b1;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp> max) max = temp;  // 순회 값이 max 보다 더 크면 max 값으로 지정
            sum = sum + temp;
        }
        System.out.println(sum * 100.0 / max / n); // .0 을 붙여서 더블형으로 계산

    }

}
