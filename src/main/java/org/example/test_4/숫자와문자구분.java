package org.example.test_4;

import java.util.Scanner;

public class 숫자와문자구분 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // String 대신 StringBuilder를 사용하여 속도를 향상
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) { // 문자열에서 숫자를 필터링하거나 유효성 검사를 수행할 때 유용
                sb.append(c); // + 연산 대신 append() 메서드를 사용
            }
        }
        System.out.println(sb.toString());
    }
}
