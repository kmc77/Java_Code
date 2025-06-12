package org.example.test_1;

import java.util.HashMap;
import java.util.Scanner;

public class 문자빈도수세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); // 문자열에서 한 글자 가져옴

            // 이미 해당 문자가 등장한 적 있으면 값 +1, 없으면 기본값 0으로 시작
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        // 키셋(keySet())을 배열로 변환하여 일반 for문으로 결과 출력
        Object[] keys = frequency.keySet().toArray(); // 문자 집합을 배열로 변환
        for (int i = 0; i < keys.length; i++) {
            char c = (Character) keys[i]; // 배열 요소를 문자로 변환
            System.out.println(c + ": " + frequency.get(c)); // 문자와 그 빈도 출력
        }
    }
}
