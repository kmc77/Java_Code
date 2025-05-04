package org.example.test_4;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = "";

        for (int i = input.length()-1; i >= 0; i--) {
            str += input.charAt(i);
        }
        System.out.println("str = " + str);
    }
}
