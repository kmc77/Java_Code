package org.example.test_1;

import java.util.Scanner;

public class 문자열회문여부검사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // 특수 문자 및 공백 제거, 대소문자 구분 없음
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < cleanedInput.length() / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInput.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "회문" : "회문 아님");
    }
}
