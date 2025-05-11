package org.example.condition;

import java.util.Scanner;

public class P2753_윤년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yoon = sc.nextInt();

        if (yoon % 4 == 0 && yoon % 100 != 0 || yoon % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
