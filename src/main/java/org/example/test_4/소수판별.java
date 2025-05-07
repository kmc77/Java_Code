package org.example.test_4;

import java.util.Scanner;

public class 소수판별 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (isSoSoo(N)) {
            System.out.println("소수입니다. ");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }

    public static boolean isSoSoo(int num) {
        if (2 > num) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
