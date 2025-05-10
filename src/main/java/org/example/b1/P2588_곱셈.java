package org.example.b1;

import java.util.Scanner;

public class P2588_곱셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n1 = a * (b % 10);
        int n2 = a * ((b / 10) % 10);
        int n3 = a * (b / 100);
        int n4 = a * (b / 1000);
        int n5 = a * b;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
    }
}
