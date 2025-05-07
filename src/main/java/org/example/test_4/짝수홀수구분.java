package org.example.test_4;

import java.util.Scanner;

public class 짝수홀수구분 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        System.out.print("짝수: ");
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("홀수: ");
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }


        }

    }
}
