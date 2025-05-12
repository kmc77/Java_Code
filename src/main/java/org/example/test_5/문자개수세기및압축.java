package org.example.test_5;

import java.util.Scanner;

public class 문자개수세기및압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // 압축 함수 호출
        String compressed = compress(input);

        // 결과 출력
        System.out.println("출력: ");
        for (int i = 0; i < compressed.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(compressed.charAt(i) + ": ");
            } else {
                System.out.println(compressed.charAt(i) + "번");
            }
        }
    }

    // 문자열 압축 함수
    public static String compress(String s) {
        // StringBuilder는 문자열을 효율적으로 추가할 수 있게 해주는 클래스
        StringBuilder sb = new StringBuilder();

        // 연속된 문자의 개수를 세기 위한 변수 (처음에는 1로 설정)
        int count = 1;

        // 문자열의 모든 문자들을 하나씩 확인하기 위한 반복문
        for (int i = 0; i < s.length(); i++) {

            // i가 마지막 문자가 아닐 때, 현재 문자와 다음 문자가 같다면
            // 연속된 문자를 세기 위해 count 값을 증가시킨다.
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
            // 현재 문자가 마지막 연속된 문자가 아니면,
            // 문자열 빌더에 문자와 그 문자가 나온 횟수를 추가하고,
            // count를 1로 초기화한다.
            else {
                sb.append(s.charAt(i)).append(count); // 문자와 개수를 추가
                count = 1; // 다음 문자를 위해 count 초기화
            }
        }

        // 압축된 문자열을 반환
        return sb.toString();
    }
}
