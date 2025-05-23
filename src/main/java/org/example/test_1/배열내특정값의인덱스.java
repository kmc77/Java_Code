package org.example.test_1;

import java.util.Scanner;

public class 배열내특정값의인덱스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i + " "); // 인덱스를 출력
                found = true;
            }
        }

        if (!found) {
            System.out.println("찾는 값이 없습니다.");
        }
    }
}
