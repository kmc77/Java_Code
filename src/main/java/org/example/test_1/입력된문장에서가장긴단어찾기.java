package org.example.test_1;

import java.util.Scanner;

public class 입력된문장에서가장긴단어찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i]; // 가장 긴 단어 갱신
            }
        }

        System.out.println(longestWord + "(" + longestWord.length() + ")");
    }
}
