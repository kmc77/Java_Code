package org.example.test_4;

import java.util.Scanner;

public class 팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long number = 1;
        for (int i = 1; i <= n; i++) {
            number *= i;
        }
        System.out.println("number = " + number);
    }
}
