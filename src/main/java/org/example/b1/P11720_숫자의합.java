package org.example.b1;

import java.io.IOException;
import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // 문자(char) 형태의 숫자를 실제 정수(int)로 바꾸는 과정 자바에서 숫자는 아스키 코드 임

        }
        System.out.println("sum = " + sum);
    }

}
