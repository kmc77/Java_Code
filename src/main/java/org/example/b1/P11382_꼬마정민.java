package org.example.b1;

import java.util.Scanner;

public class P11382_꼬마정민 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long sum = 0;

        for (int i = 0; i < input.length; i++) {
            long num = Long.parseLong(input[i]);
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
